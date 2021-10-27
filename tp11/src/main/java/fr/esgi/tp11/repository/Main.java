package fr.esgi.tp11.repository;

import fr.esgi.tp11.Address;
import fr.esgi.tp11.User;
import fr.esgi.tp11.ValidationAddressEngine;

public class Main {

    public static void main(String[] args) {
        //Create user
        Address address = new Address("ALFORTVILLE");

        ValidationAddressEngine.getInstance().test(address);

        User user1 = new User(1, "BOISSINOT", "GREGORY", address, "CHANGEME");

        Users users = new MySQLUsers();

        //Save my user
        users.add(user1);

        //Modify Password
        user1.changePassword("CHANGEPASSWORD");
        users.add(user1);

        //Modify address
        user1.changeAddress(new Address("PARIS"));
        users.add(user1);

    }
}