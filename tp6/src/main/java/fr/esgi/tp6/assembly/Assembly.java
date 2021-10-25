package fr.esgi.tp6.assembly;

import fr.esgi.tp6.MyAuthenticationService;
import fr.esgi.tp6.MyBusinessService;

import java.util.function.Function;

public class Assembly implements Function<MyBusinessService, MyBusinessService> {

    private final MyAuthenticationService logger;

    public Assembly(MyAuthenticationService logger) {
        this.logger = logger;
    }

    @Override
    public MyBusinessService apply(MyBusinessService myBusinessService) {
        return new MyBusinessServiceProxy(myBusinessService, logger);
    }
}
