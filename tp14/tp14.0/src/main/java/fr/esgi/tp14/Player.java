package fr.esgi.tp14;

import java.util.Objects;

final class Player {

    private Position position;

    Player(Position initialPosition) {
        this.position = initialPosition;
    }

    //Simple moveLeft method
    void moveLeft(int steps) {
        this.position = this.position.toTheLeft(steps);
    }

    //Other moveLeft method with return Position
    Position moveLeftWithImmutabilityMode(int steps) {
        this.position = this.position.toTheLeft(steps);
        return this.position;
    }

    //Need for test
    Position currentPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
