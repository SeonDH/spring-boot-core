package org.example.service;

import org.example.annotation.Method;
import org.springframework.stereotype.Service;

@Service
public class AService {

    private final BService bService;

    public AService(BService bService) {
        this.bService = bService;
    }

    // TODO-3 aTest() 호출
    public void businessLogic() {
        this.aTest();
        bService.bTest();
    }


    // TODO-2 aTest() 에 @Method 어노테이션 붙이기
    @Method
    public void aTest() {
        System.out.println("aTest");
    }

}