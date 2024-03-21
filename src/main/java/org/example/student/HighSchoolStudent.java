package org.example.student;


import org.springframework.stereotype.Component;


//TODO-2 @PostConstruct, @PreDestroy 를 사용한다.
@Component
public class HighSchoolStudent implements Student {

    @Override
    public void identity() {
        System.out.println("미성년자");
    }


}
