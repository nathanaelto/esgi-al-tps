package fr.esgi.tp16;

import fr.esgi.tp16.domain.*;
import fr.esgi.tp16.infrastructure.InMemoryUserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateUserCommandHandlerTest {

    @Test
    void createUser() {
        UserRepository userRepository = new InMemoryUserRepository();
        CreateUserCommandHandler userCommandHandler = new CreateUserCommandHandler(userRepository);

        CreateUser createdUser = new CreateUser("BOISSINOT", "GREGORY");
        final UserId userId = userCommandHandler.handle(createdUser);

        final User storedUser = userRepository.findById(userId);
        assertEquals(new User(userId, createdUser.lastname, createdUser.firstname), storedUser);
    }
}
