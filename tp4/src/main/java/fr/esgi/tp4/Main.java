package fr.esgi.tp4;

final class Main {
    public static void main(String[] args) {
        User user = User.of("BOISSINOT", "GREGORY");
        var jdbcUserServiceInfrastructure = new JdbcUserServiceInfrastructure();
        var loggingUserServiceInfrastructure = new LoggingUserServiceInfrastructure(new Logger());
        var userServiceInfrastructure = jdbcUserServiceInfrastructure;
        userServiceInfrastructure.save(user);
    }
}
