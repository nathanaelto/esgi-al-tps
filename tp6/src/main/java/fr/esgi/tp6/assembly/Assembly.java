package fr.esgi.tp6.assembly;

import fr.esgi.tp6.MyBusinessService;
import fr.esgi.tp6.MyLogger;

import java.util.function.Function;

public class Assembly implements Function<MyBusinessService, MyBusinessServiceProxy> {

    private final MyLogger logger;

    public Assembly(MyLogger logger) {
        this.logger = logger;
    }

    @Override
    public MyBusinessServiceProxy apply(MyBusinessService myBusinessService) {
        return new MyBusinessServiceProxy(myBusinessService, logger);
    }
}
