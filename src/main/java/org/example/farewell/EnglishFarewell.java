package org.example.farewell;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


//TODO-3 eng profile 인 경우 빈이 활성화 된다.
@Profile("eng")
@Component
public class EnglishFarewell implements Farewell {

    @Override
    public void sayGoodBye() {
        System.out.println("good bye");
    }
}
