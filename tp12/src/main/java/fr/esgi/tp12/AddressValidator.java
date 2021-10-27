package fr.esgi.tp12;

import java.util.function.Predicate;

public class AddressValidator implements Predicate<Address> {

    private static final AddressValidator INSTANCE = new AddressValidator();

    public static AddressValidator getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean test(Address address) {
        return true;
    }
}
