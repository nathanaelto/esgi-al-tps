package r.esgi.tp4;

public final class User {

    private final String lastname;
    private final String firtstname;

    private User(String lastname, String firtstname) {
        this.lastname = lastname;
        this.firtstname = firtstname;
    }

    public static User of(String lastname, String firtstname) {
        return new User(lastname, firtstname);
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirtstname() {
        return firtstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastname='" + lastname + '\'' +
                ", firtstname='" + firtstname + '\'' +
                '}';
    }
}
