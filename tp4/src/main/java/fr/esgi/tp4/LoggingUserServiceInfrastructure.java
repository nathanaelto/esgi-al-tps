package fr.esgi.tp4;

final class LoggingUserServiceInfrastructure implements UserServiceInfrastructure {

    private final LoggerService logger;

    LoggingUserServiceInfrastructure(LoggerService logger) {
        this.logger = logger;
    }

    @Override
    public void save(User user) {
        logger.log(user.toString());
    }
}
