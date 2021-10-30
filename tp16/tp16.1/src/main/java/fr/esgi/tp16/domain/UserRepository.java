package fr.esgi.tp16.domain;

public interface UserRepository {

    UserId nextIdentity();

    User findById(UserId id);

    void add(User user);
}
