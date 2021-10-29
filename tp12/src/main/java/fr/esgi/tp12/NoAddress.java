package fr.esgi.tp12;

final class NoAddress implements Address {
    @Override
    public String city() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String country() {
        throw new UnsupportedOperationException();
    }
}
