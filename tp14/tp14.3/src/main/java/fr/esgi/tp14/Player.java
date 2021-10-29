package fr.esgi.tp14;

import java.util.ArrayList;
import java.util.List;

final class Player {

    private final List<Event> recordedEvents;

    public Player(int x, int y) {
        this.recordedEvents = new ArrayList<>();
        this.recordedEvents.add(new PlayerTookInitialPosition(x, y));
    }

    //Simple moveLeft method
    public void moveLeft(int steps) {
        this.recordedEvents.add(new PlayerLeftMoved(steps));
    }

    public List<Event> recordedEvents() {
        return recordedEvents;
    }
}
