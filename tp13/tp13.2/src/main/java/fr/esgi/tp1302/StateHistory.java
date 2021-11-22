package fr.esgi.tp1302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class StateHistory {

    private final List<State> history;

    private StateHistory(List<State> history) {
        this.history = history;
    }

    public static StateHistory create(State state) {
        final ArrayList<State> history = new ArrayList<>();
        history.add(state);
        return new StateHistory(history);
    }

    public StateHistory append(State state) {
        List<State> newSates = new ArrayList<>(history);
        newSates.add(state);
        return new StateHistory(newSates);
    }

    public List<State> getStates() {
        return Collections.unmodifiableList(history);
    }
}
