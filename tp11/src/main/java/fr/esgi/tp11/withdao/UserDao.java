package fr.esgi.tp11.withdao;

import fr.esgi.tp11.User;

public interface UserDao {

    void createUser(User user);

    void deleteUser(int userId);

    void modifyUser(int userId, User user);
}
