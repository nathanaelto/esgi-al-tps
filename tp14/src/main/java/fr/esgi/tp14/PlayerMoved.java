package fr.esgi.tp13;

final class PlayerMoved implements Event{

    private final  Position position;

    public PlayerMoved(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
