package r.esgi.tp5;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new InMemoryUserRepository();

        final UserId userId = userRepository.nextId();

        User user = User.of(userId, "BOISSINOT", "GREGORY", "CHANGEME");
        System.out.println(user);
        user.changePassword("MYNEWPASSWORD");
        userRepository.save(user);

        final User retrievedUser = userRepository.byId(userId);
        System.out.println(retrievedUser);

    }
}
