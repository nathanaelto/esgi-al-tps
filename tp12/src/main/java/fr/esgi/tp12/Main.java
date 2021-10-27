package fr.esgi.tp12;

public class Main {
    public static void main(String[] args) {

        final AddressBuilder addressBuilder =
                new AddressBuilder()
                        .withCountry("FRANCE");
        Address address1 = addressBuilder
                .withCity("ALFORTVILLE")
                .withCountry("FRANCE")
                .build();

        Address address2 = addressBuilder
                .withCity("SHANGAI")
                .withCountry("CHINE")
                .build();

        User user = User.create("GREGORY", address1);
        if (!(address1 instanceof NoAddress)) {
            System.out.println(address1.city());
        }
    }
}
