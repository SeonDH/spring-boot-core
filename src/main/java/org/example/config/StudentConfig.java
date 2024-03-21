package org.example.config;

import org.example.student.UniversityStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    //TODO-2 생성한 initMethod, destroyMethod 를 등록한다.
    @Bean
    public UniversityStudent universityStudent() {
        return new UniversityStudent();
    }


}
