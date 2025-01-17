package fr.esgi.tp1602.domain;

import fr.esgi.tp1602.kernel.CommandHandler;

public final class CreateUserCommandHandler implements CommandHandler<CreateUser, UserId> {

    private final UserRepository userRepository;

    public CreateUserCommandHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserId handle(CreateUser createUser) {
        final UserId userId = userRepository.nextIdentity();
        User user = new User(userId, createUser.lastname, createUser.firstname);
        userRepository.add(user);
        return userId;
    }
}
