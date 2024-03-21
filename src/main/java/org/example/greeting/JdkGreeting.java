package org.example.greeting;

import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkGreeting implements Greeting {

    Greeting proxy;

    public JdkGreeting(Greeting greeting) {
        proxy = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
                                                  new Class[]{Greeting.class},
                                                  new GreetingProxyHandler(greeting));
    }

    public static class GreetingProxyHandler implements InvocationHandler {

        private final Object target;

        public GreetingProxyHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            StopWatch stopWatch = new StopWatch();
            System.out.println("===== StopWatch start =====");
            stopWatch.start();

            Object result = method.invoke(target, args);

            stopWatch.stop();
            System.out.println("===== StopWatch stop =====");
            System.out.println(stopWatch.prettyPrint());

            return result;
        }
    }

    @Override
    public void sayHello() {
        proxy.sayHello();
    }
}
