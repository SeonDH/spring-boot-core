package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.service.AService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final AService aService;

    @Override
    public void run(ApplicationArguments args) {
        aService.businessLogic();
    }
}