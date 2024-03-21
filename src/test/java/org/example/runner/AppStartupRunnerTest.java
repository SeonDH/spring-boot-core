package org.example.runner;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppStartupRunnerTest {

    //TODO-1 AppStartupRunner 를 각각 mockBean, SpyBean 으로 수정한 뒤 테스트 해본다.
    @Autowired
    private AppStartupRunner appStartupRunner;

    @Test
    public void test() {
        //TODO-2 AppStartupRunner 의 returnRandom 을 모킹한다.


        appStartupRunner.run(null);
        System.out.println(appStartupRunner.returnRandom());
    }

}