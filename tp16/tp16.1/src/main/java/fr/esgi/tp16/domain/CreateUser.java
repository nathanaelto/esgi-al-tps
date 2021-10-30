package fr.esgi.tp16.domain;

/**
 * Command object
 */
@SuppressWarnings("all")
public final class CreateUser {

    public String lastname;
    public String firstname;

    public CreateUser(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
