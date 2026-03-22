package az.company.lsp;

public class Main {
    static void main(String[] args) {
        Flyable flyable = new Sparrow();
        flyable.fly();

        Penguin penguin = new Penguin();
        penguin.swim(); //oz isini gorur
    }
}
