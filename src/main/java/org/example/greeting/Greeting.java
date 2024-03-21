package org.example.greeting;

import org.springframework.scheduling.annotation.Async;

public interface Greeting {
    void sayHello();

    void printThreadName();
}
