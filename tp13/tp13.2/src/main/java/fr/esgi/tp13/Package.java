package fr.esgi.tp13;

import java.time.LocalDateTime;

final class Package {

    private final int id;
    private final LocalDateTime creationDate;
    private RawFileHistory history;

    Package(int id, LocalDateTime creationDate, State initialState) {
        assert creationDate != null;
        assert initialState != null;
        this.id = id;
        this.creationDate = creationDate;
        this.history = RawFileHistory.create().append(initialState);
    }

     void changeState(State state) {
        assert state != null;
        this.history = history.append(state);
    }

    public RawFileHistory getHistory() {
        return history;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
