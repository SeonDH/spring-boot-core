package org.example;

import org.example.strategy.Communication;
import org.example.strategy.Steps;

public class Main {

    // TODO-1 프로그램의 제어을 사용자가 직접하고 있어서 initialize() -> process() -> destroy() 순서로 동작할 것이라 장담할 수 없다.
    //  사용자 실수로 destroy() -> process() -> initialize() 순으로 호출할 수도 있음
    public static void main(String[] args) throws Exception {
        Steps steps = new Communication();
        steps.initialize();
        steps.process();
        steps.destroy();
    }

}