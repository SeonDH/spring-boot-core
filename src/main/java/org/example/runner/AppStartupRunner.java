package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.rps.RockPaperScissor;
import org.example.rps.RpsElement;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final RockPaperScissor rockPaperScissor;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(rockPaperScissor.play(RpsElement.PAPER));
    }
}