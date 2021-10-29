package fr.esgi.tp13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class RawFileHistory {

    private final List<State> history;

    private RawFileHistory(List<State> history) {
        this.history = history;
    }

    static RawFileHistory create() {
        return new RawFileHistory(new ArrayList<>());
    }

    RawFileHistory append(State state) {
        List<State> newSates = new ArrayList<>(history);
        newSates.add(state);
        return new RawFileHistory(newSates);
    }

    public List<State> getStates() {
        return Collections.unmodifiableList(history);
    }
}
