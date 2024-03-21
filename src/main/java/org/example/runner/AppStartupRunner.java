package org.example.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.student.HighSchoolStudent;
import org.example.student.UniversityStudent;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class AppStartupRunner implements ApplicationRunner {

    private final HighSchoolStudent highSchoolStudent;
    private final UniversityStudent universityStudent;

    @Override
    public void run(ApplicationArguments args) {

        log.info(highSchoolStudent.getSchool());
        log.info(highSchoolStudent.echo("hello, high school"));

        log.info(universityStudent.getSchool());
        log.info(universityStudent.echo("hello, university"));

    }
}