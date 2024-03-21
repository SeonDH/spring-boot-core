package org.example.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;



@AllArgsConstructor
@Getter
@ConfigurationProperties("greeting")
public class GreetingProperties {
    private String english;
    private String korean;
}
