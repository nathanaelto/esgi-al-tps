package fr.esgi.tp11.dao;

import fr.esgi.tp11.Address;
import fr.esgi.tp11.User;

public class MainDAO {
    public static void main(String[] args) {
        UserDao userDao = new MySQLUserDAO();

        AddressDAO addressDAO = new MySQLAddressDAO();
        Address address = new Address("ALFORTVILLE");
        addressDAO.createAddress(address);

        //Create user
        User user1 = new User(1, "BOISSINOT", "GREGORY", address, "CHANGEME");
        userDao.createUser(user1);

        //Modify user
        user1.changePassword("NEWPASSWORD");
        userDao.modifyUser(user1.getId(), user1);

        //Delete user
        userDao.deleteUser(user1.getId());
    }
}
