package fr.esgi.tp13;

final class PackageId {
    private final int id;

    private PackageId(int id) {
        this.id = id;
    }

    static PackageId of(int id) {
        return new PackageId(id);
    }

    public int value() {
        return id;
    }
}
