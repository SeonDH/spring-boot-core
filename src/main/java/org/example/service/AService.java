package org.example.service;

import org.example.annotation.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {

    private final BService bService;

    public AService(BService bService) {
        this.bService = bService;
    }

    // TODO-1 AService 에서 AService 를 참조하도록 구조를 수정한다.
    private AService aService;

    @Autowired
    void setAService(AService aService) {
        this.aService = aService;
    }

    public void businessLogic() {
        //TODO-3 내부 메소드 호출이 아니라, 새롭게 주입 받은 aService 를 사용하도록 수정한다.
        aService.aTest();
        bService.bTest();
    }


    @Method
    public void aTest() {
        System.out.println("aTest");
    }

}