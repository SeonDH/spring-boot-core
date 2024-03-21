package org.example.student;


//TODO-4 UniversityStudent 가 InitializingBean, DisposableBean 를 구현한다.
public class UniversityStudent implements Student {

    @Override
    public void identity() {
        System.out.println("성인");
    }
}
