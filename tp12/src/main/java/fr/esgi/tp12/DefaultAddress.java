package fr.esgi.tp12;

final class DefaultAddress implements Address {

    private final String city;

    DefaultAddress(String city) {
        this.city = city;
    }

    @Override
    public String city() {
        return city;
    }
}
