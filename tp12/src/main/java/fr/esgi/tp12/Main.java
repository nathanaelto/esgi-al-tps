package fr.esgi.tp12;

public class Main {
    public static void main(String[] args) {
        User user = User.create("GREGORY", AddressFactory.create("ALFORTVILLE"));
        final Address address = user.getAddress();
        if (!(address instanceof NoAddress)){
            System.out.println(address.city());
        }
    }
}
