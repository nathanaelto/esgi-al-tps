package fr.esgi.tp13;

import java.time.LocalDateTime;

final class Package {

    private final int id;
    private final LocalDateTime creationDate;
    private State state;

    Package(int id, LocalDateTime creationDate, State initialState) {
        assert creationDate != null;
        assert initialState != null;
        this.id = id;
        this.creationDate = creationDate;
        this.state = initialState;
    }

    void changeState(State state) {
        assert state != null;
        this.state = state;
    }
}
