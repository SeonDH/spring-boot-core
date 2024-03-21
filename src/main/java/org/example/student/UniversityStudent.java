package org.example.student;


//TODO-1 @PostConstruct, @PreDestroy 를 사용한다.
public class UniversityStudent implements Student {

    @Override
    public void identity() {
        System.out.println("성인");
    }

}
