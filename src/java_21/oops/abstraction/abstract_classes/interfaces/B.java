package java21.oops.abstraction.abstract_classes.interfaces;

public interface B {
    void display();

    default void meth1() {
        System.out.println("B default meth1");

    }

    default void meth2() {
        System.out.println("B default meth2");
    }
}
