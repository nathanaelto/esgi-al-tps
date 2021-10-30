package fr.esgi.tp16.kernel;

public interface CommandHandler<C extends Command, R> {
    R handle(C command);
}
