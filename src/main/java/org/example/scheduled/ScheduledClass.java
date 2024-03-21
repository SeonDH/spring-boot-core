package org.example.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//TODO-2 Bean!
@Component
public class ScheduledClass {

    //TODO-3 @Scheduled 를 이용해서 주기적으로 실행 시킬 수 있다.
    @Scheduled(fixedRate = 5000)  // 5000밀리초(5초)마다 실행
    public void reportCurrentTime() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
        System.out.println("Current time: " + LocalDateTime.now());
    }

}
