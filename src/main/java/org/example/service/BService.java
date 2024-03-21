package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.annotation.Method;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BService {


    @Method
    public void bTest() {
        System.out.println("bTest");
    }

}
