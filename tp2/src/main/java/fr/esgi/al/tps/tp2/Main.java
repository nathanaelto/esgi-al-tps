package fr.esgi.al.tps.tp2;


import fr.esgi.al.tps.tp2.common.Person;
import fr.esgi.al.tps.tp2.common.RegisteredPersonEvent;
import fr.esgi.al.tps.tp2.event.DefaultEventBus;
import fr.esgi.al.tps.tp2.moduleA.RegisterService;
import fr.esgi.al.tps.tp2.moduleB.PersonMailSender;
import fr.esgi.al.tps.tp2.moduleB.RegisterPersonEventSubscription;

import java.util.Collections;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        var subscriptionMap =
                Collections.singletonMap(RegisteredPersonEvent.class,
                        Collections.singletonList(new RegisterPersonEventSubscription(new PersonMailSender())));
        var eventBus = new DefaultEventBus(subscriptionMap);

        RegisterService registerService = new RegisterService(eventBus);

        Person person = Person.of("BOISSINOT", "GREGORY");
        registerService.register(person);
    }
}
