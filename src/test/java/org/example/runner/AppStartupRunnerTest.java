package org.example.runner;

import org.example.sender.Sender;
import org.junit.jupiter.api.Test;

import java.io.IOException;

//TODO-1 Mock 사용을 위한 어노테이션 설정
class AppStartupRunnerTest {


    //TODO-2 Mock 으로 만들기 위한 어노테이션
    Sender sender;

    //TODO-3 Mock 을 주입받기 위한 어노테이션
    AppStartupRunner appStartupRunner;


    @Test
    void run() throws IOException {

        //TODO-4 Given: sendMessages 가 들어오면 아무 행동도 하지 않도록 설정한다. ** return 값이 void **

        // When
        appStartupRunner.run(null);

        //TODO-5 Then: sendMessages 가 1회 실행 된걸 확인한다.

    }
}