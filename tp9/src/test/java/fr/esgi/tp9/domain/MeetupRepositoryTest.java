package fr.esgi.tp9.domain;

import fr.esgi.tp9.infrastructure.InMemoryMeetupRepository;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetupRepositoryTest {

    private final Clock clock = new StubClock();
    private final Map<Integer, List<Meetup>> testData =
            Collections.singletonMap(11, List.of(new Meetup(1, 11), new Meetup(2, 11)));
    private final MeetupRepository stubMeetupRepository = new InMemoryMeetupRepository(clock, testData);

    @Test
    void addition() {
        final List<Meetup> upcommingMeetups = stubMeetupRepository.findUpcommingMeetups();
        assertEquals(2, upcommingMeetups.size());
        for (Meetup upcommingMeetup : upcommingMeetups) {
            final int meetupScheduledAtHour = clock.currentTime().getHour();
            assertEquals(meetupScheduledAtHour, upcommingMeetup.getScheduledAtHour());
        }
    }
}
