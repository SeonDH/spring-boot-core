package org.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PrintService {

    @Value("${test.url}")
    private String testUrl;

    public void print() {
        System.out.println(testUrl);
    }
}