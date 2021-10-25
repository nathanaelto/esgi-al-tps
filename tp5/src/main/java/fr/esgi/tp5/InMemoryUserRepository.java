package fr.esgi.tp5;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

final class InMemoryUserRepository implements UserRepository {

    //private final AtomicInteger counter = new AtomicInteger(0);
    private int counter = 0;
    private final Map<UserId, User> data = new ConcurrentHashMap<>();

    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void save(User user) {
        data.put(user.getUserId(), user);
    }

    @Override
    public User byId(UserId userId) {
        final User user = data.get(userId);
        if (user == null) {
            throw new RuntimeException("No user for " + userId.getValue());
        }
        return user;
    }

    @Override
    public UserId nextId() {
        lock.tryLock();
        try {
            ++counter;
            return UserId.of(String.valueOf(counter));
        } finally {
            lock.unlock();
        }
    }
}
