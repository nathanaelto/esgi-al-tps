package r.esgi.tp4;

public class Main {
    public static void main(String[] args) {
        User user = User.of("BOISSINOT", "GREGORY");
        //var userServiceInfrastructure = new JdbcUserServiceInfrastructure();
        var loggingUserServiceInfrastructure = new LoggingUserServiceInfrastructure(new Logger());
        var userServiceInfrastructure = loggingUserServiceInfrastructure;
        userServiceInfrastructure.save(user);
    }
}
