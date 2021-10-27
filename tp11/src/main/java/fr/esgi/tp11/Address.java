package fr.esgi.tp11;

public class Address {

    private final int id;
    private final String city;

    public Address(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }
}
