package org.example.farewell;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//TODO-4 eng profile 이 아닌 경우 빈이 활성화 된다.
@Profile("!eng")
@Component
public class KoreanFarewell implements Farewell {

    @Override
    public void sayGoodBye() {
        System.out.println("잘 가");
    }
}
