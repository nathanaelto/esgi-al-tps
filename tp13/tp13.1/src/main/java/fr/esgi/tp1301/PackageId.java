package fr.esgi.tp1301;

import java.util.Objects;

final class PackageId {

    private final int id;

    private PackageId(int id) {
        this.id = id;
    }

    public static PackageId of(int id) {
        return new PackageId(id);
    }

    public int value() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageId packageId = (PackageId) o;
        return id == packageId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
