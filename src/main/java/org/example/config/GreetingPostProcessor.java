package org.example.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//TODO-1 BeanPostProcessor 를 구현한다.
// BeanPostProcessor 에도 @Component 가 붙어있다.
@Component
public class GreetingPostProcessor implements BeanPostProcessor {


    //TODO-2 java init 전에 호출되는 postProcessBeforeInitialization() 를 구현해본다.
    // 로그에서 Greeting 뿐만 아니라, 모든 bean 에서 로그가 찍히는 걸 확인한다.
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before init bean: " + bean + ", beanName: " + beanName);

        //        if (bean instanceof KoreanGreeting) {
        //            return new EnglishGreeting();
        //        } else if (bean instanceof EnglishGreeting) {
        //            return new KoreanGreeting();
        //        }

        return bean;
    }

    //TODO-3 java init 전에 호출되는 postProcessAfterInitialization() 를 구현해본다.
    // 로그에서 Greeting 뿐만 아니라, 모든 bean 에서 로그가 찍히는 걸 확인한다.
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after init bean: " + bean + ", beanName: " + beanName);

        //        if (bean instanceof KoreanGreeting) {
        //            return new EnglishGreeting();
        //        } else if (bean instanceof EnglishGreeting) {
        //            return new KoreanGreeting();
        //        }

        return bean;
    }

}