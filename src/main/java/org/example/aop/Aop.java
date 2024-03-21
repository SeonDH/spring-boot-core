package org.example.aop;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Aop {


    //TODO-1 student 에서 echo() 가 호출되는 상황에 대한 point cut 을 작성한다. hint ** args point cut 은 다른 포인트 컷으로 범위 제한을 해줘야 한다.**

    //TODO-2 student 에서 getSchool() 이 호출되는 상황에 대한 point cut 을 작성한다.

    //TODO-3 echo() 가 호출 될 때, 인자 값을 받아서 출력하는 aop 를 작성한다.

    //TODO-4 getSchool() 이 호출 될 때, UniversityStudent 인 경우 가로채고 다른 값을 반환하도록 수정한다.
    // 고려할 점
    // 1. 어떤 advice 를 사용해야 하는지
    // 2. 어떤 값을 보면 UniversityStudent 여부를 확인할 수 있을지?


}
