package fr.esgi.tp12;

public class NoAddress implements Address {
    @Override
    public String city() {
        throw new UnsupportedOperationException();
    }
}
