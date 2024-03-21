package org.example.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;


//TODO-2 ConfigurationProperties 파일을 생성한다.
// 값을 채워줄 수 있는 생성자나 setter 값이 필요한다. (여기서는 lombok의 @AllArgsConstructor를 사용한다.)
@AllArgsConstructor
@Getter
@ConfigurationProperties("greeting")
public class GreetingProperties {
    private String english;
    private String korean;
}
