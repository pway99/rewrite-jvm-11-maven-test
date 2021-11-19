package org.example;

public class C {
    A a = new A();
    A.B b = new A.B();
    void doSomething() {
        int i = b.getInt();
    }
}
