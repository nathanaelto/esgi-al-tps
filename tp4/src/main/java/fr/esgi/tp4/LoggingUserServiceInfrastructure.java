package fr.esgi.tp4;

final class LoggingUserServiceInfrastructure implements UserServiceInfrastructure {

    private final Logger logger;

    public LoggingUserServiceInfrastructure(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void save(User user) {
        logger.log(user.toString());
    }
}
