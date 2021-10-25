package fr.esgi.tp6.assembly;

import fr.esgi.tp6.MyAuthenticationService;
import fr.esgi.tp6.MyBusinessService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBusinessServiceProxy extends MyBusinessService {

    private static Logger logger = Logger.getLogger(MyBusinessServiceProxy.class.getName());

    private final MyBusinessService myBusinessService;
    private final MyAuthenticationService myAuthenticationService;

    public MyBusinessServiceProxy(MyBusinessService myBusinessService, MyAuthenticationService myAuthenticationService) {
        this.myBusinessService = myBusinessService;
        this.myAuthenticationService = myAuthenticationService;
    }

    @Override
    public void doSomething() {
        logger.log(Level.INFO, "Beginning processing.");
        long start = System.nanoTime();
        if (myAuthenticationService.authenticate()) {
            myBusinessService.doSomething();
        }
        long end = System.nanoTime();
        logger.log(Level.INFO, String.format("Ending with %d ms.", (end - start) / 1000));
    }
}
