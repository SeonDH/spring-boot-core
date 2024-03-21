package org.example.student;


import org.springframework.stereotype.Component;

@Component
public class HighSchoolStudent implements Student {

    @Override
    public void identity() {
        System.out.println("미성년자");
    }


}
