package fr.esgi.tp6;

import fr.esgi.tp6.assembly.Assembly;

public class Main {

    public static void main(String[] args) {
        MyAuthenticationService myAuthenticationService = new MyAuthenticationService();
        MyBusinessService myBusinessService = new MyBusinessService();

        Assembly assembly = new Assembly(myAuthenticationService);
        final MyBusinessService myNewBusinessService = assembly.apply(myBusinessService);

        myNewBusinessService.doSomething();
    }
}
