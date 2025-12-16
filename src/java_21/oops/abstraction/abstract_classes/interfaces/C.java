package java21.oops.abstraction.abstract_classes.interfaces;

import java21.oops.abstraction.interfaces.A;

public class C implements A, B {
    @Override
    public void display() {
    }

    @Override
    public void meth1() {
        B.super.meth1();
    }
}
