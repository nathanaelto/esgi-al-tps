package fr.esgi.tp3;

class Main {
    public static void main(String[] args) {
        Foo foo = new OtherFoo();
        Bar bar = new Bar();
        bar.bar(foo);
    }
}
