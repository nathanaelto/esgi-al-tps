package fr.esgi.tp1302;

import java.time.LocalDateTime;
import java.util.Objects;

final class Package {

    private final PackageId id;
    private final LocalDateTime creationDate;
    private RawFileHistory history;

    public Package(PackageId id, LocalDateTime creationDate, State initialState) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(creationDate);
        Objects.requireNonNull(initialState);
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

    public PackageId getId() {
        return id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
