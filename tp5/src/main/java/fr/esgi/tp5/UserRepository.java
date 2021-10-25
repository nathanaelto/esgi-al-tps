package fr.esgi.tp5;

interface UserRepository {
    void save(User user);

    User byId(UserId userId);

    UserId nextId();
}
