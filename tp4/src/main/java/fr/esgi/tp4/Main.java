package fr.esgi.tp4;

final class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        User user = User.of("BOISSINOT", "GREGORY");
        var jdbcUserServiceInfrastructure = new JdbcUserServiceInfrastructure();
        var loggingUserServiceInfrastructure = new LoggingUserServiceInfrastructure(new LoggerService());
        var userServiceInfrastructure = loggingUserServiceInfrastructure;
        userServiceInfrastructure.save(user);
    }
}
