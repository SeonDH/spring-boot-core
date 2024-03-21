package org.example.aop;


// TODO-2 Aop 관련 설정을 하고, application context 에서 인식 할 수 있도록 한다. hint ** @Aspect, @Component **
public class SenderAop {

    //TODO-3 어디에 aop 를 적용할 건지 설정한다. hint ** @PointCut, execution **
    public void cut() {
    }

    // TODO-4 어떤 작업을 할지 결정한다. hint ** @Around, ProceedingJoinPoint, StopWatch(시간 측정) **
    public Object around() throws Throwable {
        return null;
    }
}
