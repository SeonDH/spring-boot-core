package org.example.customcode.farewell;

import org.example.framework.annotations.Part;

@Part
public class EnglishFarewell implements Farewell {

    public void sayGoodBye() {
        System.out.println("good bye");
    }
}
