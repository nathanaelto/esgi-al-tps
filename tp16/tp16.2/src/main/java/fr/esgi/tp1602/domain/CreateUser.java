package fr.esgi.tp1602.domain;

import fr.esgi.tp1602.kernel.Command;

/**
 * Command object
 */
@SuppressWarnings("all")
public final class CreateUser implements Command {

    public String lastname;
    public String firstname;

    public CreateUser(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
