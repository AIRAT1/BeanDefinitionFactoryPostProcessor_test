package de.test;

@DeprecatedClass(newImpl = T1000.class)
public class Terminator {
    void say() {
        System.out.println(Terminator.class.getCanonicalName());
    }
}
