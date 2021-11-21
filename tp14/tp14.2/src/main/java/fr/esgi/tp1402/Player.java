package fr.esgi.tp1402;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class Player {

    private final List<Event> recordedEvents;
    private Position position;

    public Player(Position initialPosition) {
        this.position = initialPosition;
        this.recordedEvents = new ArrayList<>();
        this.recordedEvents.add(new PlayerTookInitialPosition(initialPosition));
    }

    //Simple moveLeft method
    public void moveLeft(int steps) {
        var nextPosition = this.position.toTheLeft(steps);
        this.position = nextPosition;
        this.recordedEvents.add(new PlayerMoved(nextPosition));
    }

    public List<Event> recordedEvents() {
        return recordedEvents;
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
