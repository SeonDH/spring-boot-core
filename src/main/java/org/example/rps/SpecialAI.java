package org.example.rps;

import org.springframework.stereotype.Component;

@Component
public class SpecialAI {

    public RpsElement getElement() {
        return RpsElement.getRandomRpsElement();
    }

    public String doSomething1() {
        return "Iam doing something 1";
    }

    public String doSomething2() {
        return "Iam doing something 2";
    }

    public String doSomething3() {
        return "Iam doing something 3";
    }

    public String doSomething4() {
        return "Iam doing something 4";
    }

}
