package fr.esgi.tp7.domain;

import java.util.List;

public interface UserRepository {
    void save(User user);

    User byId(UserId userId);

    UserId nextId();

    List<User> findAll();
}
