package fr.esgi.tp12;

public class AddressFactory {

    private AddressFactory() {
        throw new AssertionError();
    }

    public static Address create(String city) {
        return new DefaultAddress(city);
    }
}
