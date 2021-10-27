package fr.esgi.tp12;

import java.util.Objects;

public class AddressBuilder {

    private String city;
    private String country;

    public static AddressBuilder create() {
        return new AddressBuilder();
    }

    public AddressBuilder withCity(String city) {
        AddressBuilder builder = new AddressBuilder();
        this.city = Objects.requireNonNull(city);
        this.country = country;
        return builder;
    }

    public AddressBuilder withCountry(String country) {
        AddressBuilder builder = new AddressBuilder();
        this.city = city;
        this.country = Objects.requireNonNull(country);
        return builder;
    }

    public Address build() {
        return new DefaultAddress(city, country);
    }
}
