package de.test;

import org.springframework.stereotype.Component;

@Component
public class T1000 extends Terminator{
    @Override
    void say() {
        System.out.println(T1000.class.getCanonicalName());
    }
}
