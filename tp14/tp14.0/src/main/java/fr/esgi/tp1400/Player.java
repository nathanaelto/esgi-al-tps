package fr.esgi.tp1400;

import java.util.Objects;

final class Player {

    private Position position;

    public Player(Position initialPosition) {
        this.position = initialPosition;
    }

    //Simple moveLeft method
    public void moveLeft(int steps) {
        this.position = this.position.toTheLeft(steps);
    }

    //Other moveLeft method with new Position object
    public Position moveLeftWithImmutabilityMode(int steps) {
        this.position = this.position.toTheLeft(steps);
        return this.position;
    }

    //Need for test
    public Position currentPosition() {
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
