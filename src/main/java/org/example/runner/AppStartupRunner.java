package org.example.runner;

import org.example.student.HighSchoolStudent;
import org.example.student.UniversityStudent;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-1 Constructor Injection
    private HighSchoolStudent highSchoolStudent;
    private UniversityStudent universityStudent;

    @Override
    public void run(ApplicationArguments args) {
        highSchoolStudent.identity();
        universityStudent.identity();
    }
}