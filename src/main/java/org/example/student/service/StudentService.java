package org.example.student.service;

import org.example.student.properties.StudentProperties;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //TODO-4 Bean 처럼 사용
    StudentProperties studentProperties;

    //TODO-5 @Value 를 통해서도 가져 와본다.
    public String firstName;

    public void printFirstName() {
        System.out.println(studentProperties.getFirstName());
    }


}
