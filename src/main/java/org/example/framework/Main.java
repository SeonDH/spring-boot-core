package org.example.framework;

import org.example.framework.factory.Factory;
import org.example.framework.strategy.Steps;

//TODO-1 framework 부분은 유저가 작성하는 부분이 아님
// 어떻게 순서로 동작할 지는 이미 정해져 있다. (initialize() -> process() -> destroy())
// 유저는 Steps 를 구현하면 된다.
public class Main {

    public static void main(String[] args) throws Exception {

        Steps steps = Factory.getInstance(Steps.class);

        if (steps == null) {
            throw new RuntimeException("Steps not initialized");
        }


        steps.initialize();
        steps.process();
        steps.destroy();
    }
}