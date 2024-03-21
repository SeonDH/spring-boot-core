package org.example.student;


//TODO-1 HighSchoolStudent 를 Bean 으로 만든다 ** hint @Component **
//TODO-3 HighSchoolStudent 가 InitializingBean, DisposableBean 를 구현한다.
public class HighSchoolStudent implements Student {

    @Override
    public void identity() {
        System.out.println("미성년자");
    }


}
