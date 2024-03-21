package org.example.config;

import org.example.student.HighSchoolStudent;
import org.example.student.Inner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Inner innerStudent() {
        return new Inner();
    }

    //TODO-2 주입 하고 싶은 객체를 파라미터로 넘긴 후, 초기화 할 때 추가한다.
    @Bean
    public HighSchoolStudent highSchoolStudent() {
        return new HighSchoolStudent();
    }

}
