package fr.esgi.tp9.domain;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class StubClock implements Clock {
    @Override
    public ZonedDateTime currentTime() {
        return ZonedDateTime.of(2021, 10, 27, 11, 30, 50, 0, ZoneId.systemDefault());
    }
}
