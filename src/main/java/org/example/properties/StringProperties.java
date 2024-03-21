package org.example.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

import java.util.List;

@Getter
@ConfigurationProperties("string")
public class StringProperties {
    private final String notNull;
    private final String hasLength;
    private final List<String> notEmpty;
    private final String email;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public StringProperties(String notNull, String hasLength, List<String> notEmpty, String email) {
        //TODO-1 Assert 를 이용하여, 값을 검사 할 수 있다.
        Assert.notNull(notNull, "notNull must not be null");
        Assert.hasLength(hasLength, "hasLength must not be empty");
        Assert.notEmpty(notEmpty, "notEmpty must not be empty");
        Assert.state(email != null && email.matches(EMAIL_REGEX), "Invalid email format: " + email);
        this.notNull = notNull;
        this.hasLength = hasLength;
        this.notEmpty = notEmpty;
        this.email = email;
    }

}
