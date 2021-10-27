package fr.esgi.tp9.domain;

import java.time.ZonedDateTime;

public class SystemClock implements Clock {
    @Override
    public ZonedDateTime currentTime() {
        return ZonedDateTime.now();
    }
}
