package org.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


//TODO-2 ConfigurationProperties 파일을 생성한다.
// record 를 사용하면 생성자, getter, equals, hashCode, toString 이 자동으로 생성된다.
@ConfigurationProperties("greeting")
public record GreetingProperties(String english, String korean) {
}
