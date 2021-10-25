package fr.esgi.tp3;

public class Main {
    public static void main(String[] args) {

        Foo foo = new OtherFoo();

        Bar bar = new Bar();
        bar.bar(foo);
    }
}
