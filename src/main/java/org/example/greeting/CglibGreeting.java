package org.example.greeting;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

//TODO-1 Greeting 을 받아서 로그를 찍는 Greeting 프록시를 만든다.
public class CglibGreeting implements Greeting {

    Greeting proxy;

    public CglibGreeting(Greeting greeting) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Greeting.class);
        enhancer.setCallback(new GreetingInterceptor(greeting));
        proxy = (Greeting) enhancer.create();
    }

    public static class GreetingInterceptor implements MethodInterceptor {

        private final Object target;

        public GreetingInterceptor(Object target) {
            this.target = target;
        }

        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            StopWatch stopWatch = new StopWatch();
            System.out.println("===== StopWatch start =====");
            stopWatch.start();

            Object result = methodProxy.invoke(target, args);

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
