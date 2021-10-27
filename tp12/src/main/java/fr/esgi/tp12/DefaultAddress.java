package fr.esgi.tp12;

final class DefaultAddress implements Address {

    private final String city;
    private final String country;

    DefaultAddress(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String city() {
        return city;
    }

    @Override
    public String country() {
        return country;
    }


}
