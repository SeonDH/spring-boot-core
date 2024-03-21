package org.example.logging;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class TimeLogger {

    //TODO-1 method 를 인자로 받아서 시간 실행 함수로 감싼다. 비즈니스 로직과 시간 측정 로직을 분리했다.
    public void printTime(Runnable runnable) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("===== StopWatch start =====");
        stopWatch.start();
        runnable.run();
        stopWatch.stop();
        System.out.println("===== StopWatch stop =====");
        System.out.println(stopWatch.prettyPrint());
    }

}
