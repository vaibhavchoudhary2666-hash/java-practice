package Interface;

public interface animal {
    void sleep();
    void eat();
    default void dead() {
        System.out.println("died");
    }
    void sound();
}
