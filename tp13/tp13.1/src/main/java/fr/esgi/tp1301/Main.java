package fr.esgi.tp1301;

public class Main {

    public static void main(String[] args) {

        final PackageState state = PackageState.IN_TRANSIT;
        System.out.println(state.ordinal());
        System.out.println(state.getId());
    }
}
