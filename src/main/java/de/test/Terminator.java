package de.test;

import org.springframework.stereotype.Component;

@DeprecatedClass(newImpl = T1000.class)
@Component
public class Terminator {
    void say() {
        System.out.println(Terminator.class.getCanonicalName());
    }
}
