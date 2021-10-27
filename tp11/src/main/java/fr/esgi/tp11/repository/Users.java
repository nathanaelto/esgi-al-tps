package fr.esgi.tp11.repository;

import fr.esgi.tp11.User;
import fr.esgi.tp11.kernel.Repository;

@Repository
public interface Users {

    User findById(int userId) throws NoSuchUserException;

    void add(User user);
}
