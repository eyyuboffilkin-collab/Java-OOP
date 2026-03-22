package az.company.isp;

public class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Isleyir");
    }

    public void eat() {
        System.out.println("Yeyir");
    }
}
