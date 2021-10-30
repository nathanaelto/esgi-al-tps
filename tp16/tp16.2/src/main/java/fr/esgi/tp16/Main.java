package fr.esgi.tp16;

import fr.esgi.tp16.domain.CreateUser;
import fr.esgi.tp16.domain.CreateUserCommandHandler;
import fr.esgi.tp16.domain.UserId;
import fr.esgi.tp16.infrastructure.InMemoryUserRepository;

public class Main {

    public static void main(String[] args) {
        CreateUserCommandHandler userCommandHandler = new CreateUserCommandHandler(new InMemoryUserRepository());
        CreateUser createUser = new CreateUser("BOISSINOT", "GREGORY");
        final UserId userId = userCommandHandler.handle(createUser);
    }
}
