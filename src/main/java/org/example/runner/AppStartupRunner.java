package org.example.runner;

import org.example.greeting.Greeting;
import org.example.greeting.JapaneseGreeting;
import org.example.greeting.KoreanGreeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    private final Greeting greeting;
    private final Greeting koreanGreeting;
    private final Greeting japaneseGreeting;
    private final Greeting qKoreanGreeting;
    private final Greeting myCustomBeanName;
    private final Greeting qMyCustomBeanName;

    private final KoreanGreeting cKoreanGreeting;
    private final JapaneseGreeting cJapaneseGreeting;


    public AppStartupRunner(Greeting greeting,
                            Greeting koreanGreeting,
                            Greeting japaneseGreeting,
                            Greeting myCustomBeanName,
                            @Qualifier("koreanGreeting") Greeting qKoreanGreeting,
                            @Qualifier("myCustomBeanName") Greeting qMyCustomBeanName,
                            KoreanGreeting cKoreanGreeting,
                            JapaneseGreeting cJapaneseGreeting) {
        this.greeting = greeting;
        this.koreanGreeting = koreanGreeting;
        this.japaneseGreeting = japaneseGreeting;
        this.myCustomBeanName = myCustomBeanName;
        this.qKoreanGreeting = qKoreanGreeting;
        this.qMyCustomBeanName = qMyCustomBeanName;
        this.cKoreanGreeting = cKoreanGreeting;
        this.cJapaneseGreeting = cJapaneseGreeting;
    }

    @Override
    public void run(ApplicationArguments args) {
        greeting.sayHello();
        koreanGreeting.sayHello();
        japaneseGreeting.sayHello();
        myCustomBeanName.sayHello();

        System.out.println("====================");

        qKoreanGreeting.sayHello();
        qMyCustomBeanName.sayHello();

        System.out.println("====================");


        cKoreanGreeting.sayHello();
        cJapaneseGreeting.sayHello();

    }
}