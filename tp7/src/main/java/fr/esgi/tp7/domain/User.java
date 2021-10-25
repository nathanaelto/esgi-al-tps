package fr.esgi.tp7.domain;

import java.util.Objects;

public final class User {

    private final UserId userId;
    private final String lastname;
    private final String firstname;
    private String password;

    private User(UserId userId, String lastname, String firtstname, String password) {
        this.userId = userId;
        this.lastname = lastname;
        this.firstname = firtstname;
        this.password = password;
    }

    public static User of(UserId userId, String lastname, String firstname, String password) {
        return new User(userId, lastname, firstname, password);
    }

    public UserId getUserId() {
        return userId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void changePassword(String newPassword) {
        this.password = Objects.requireNonNull(newPassword);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
