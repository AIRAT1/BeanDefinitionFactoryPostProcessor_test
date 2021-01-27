package de.test;

public class T1000 extends Terminator{
    @Override
    void say() {
        System.out.println(T1000.class.getCanonicalName());
    }
}
