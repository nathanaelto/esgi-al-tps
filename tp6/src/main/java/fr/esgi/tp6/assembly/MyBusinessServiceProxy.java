package fr.esgi.tp6.assembly;

import fr.esgi.tp6.MyBusinessService;
import fr.esgi.tp6.MyLogger;

public class MyBusinessServiceProxy extends MyBusinessService {

    private final MyBusinessService myBusinessService;
    private final MyLogger logger;

    public MyBusinessServiceProxy(MyBusinessService myBusinessService, MyLogger logger) {
        this.myBusinessService = myBusinessService;
        this.logger = logger;
    }

    @Override
    public void doSomething() {
        logger.log("Beginning processing.");
        long start = System.nanoTime();
        myBusinessService.doSomething();
        long end = System.nanoTime();
        logger.log(String.format("Ending with %d ms.", (end - start) / 1000));
    }
}
