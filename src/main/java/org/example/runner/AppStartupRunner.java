package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.service.Aservice;
import org.example.service.Bservice;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    private final Aservice aservice;
    private final Bservice bservice;

    @Override
    public void run(ApplicationArguments args) {

        aservice.printHashCode();
        bservice.printHashCode();

    }
}