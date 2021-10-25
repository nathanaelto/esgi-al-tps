package fr.esgi.tp6;

import fr.esgi.tp6.assembly.Assembly;
import fr.esgi.tp6.assembly.MyBusinessServiceProxy;

public class Main {

    public static void main(String[] args) {
        MyLogger myLogger = new MyLogger();
        MyBusinessService myBusinessService = new MyBusinessService();
        Assembly assembly = new Assembly(myLogger);
        final MyBusinessServiceProxy myBusinessServiceProxy = assembly.apply(myBusinessService);

        myBusinessServiceProxy.doSomething();
    }
}
