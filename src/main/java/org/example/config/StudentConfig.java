package org.example.config;

import org.example.student.UniversityStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public UniversityStudent universityStudent() {
        return new UniversityStudent();
    }

}
