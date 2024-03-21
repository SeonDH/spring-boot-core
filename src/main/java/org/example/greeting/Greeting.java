package org.example.greeting;

import java.util.concurrent.Future;

public interface Greeting {
    void sayHello();

    Future<Void> printThreadName();
}
