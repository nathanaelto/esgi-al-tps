package fr.esgi.tp12;

final class AddressFactory {

    private AddressFactory() {
        throw new AssertionError();
    }

    static Address create(String city, String country) {
        return new DefaultAddress(city, country);
    }
}
