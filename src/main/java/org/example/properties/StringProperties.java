package org.example.properties;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@Getter
@ConfigurationProperties("string")
//TODO-2 @Validated 어노테이션을 추가한다.
@Validated
public class StringProperties {
    //TODO-3
    @Email
    private String email;
    @NotNull
    private String notNull;
    @NotEmpty
    private String notEmpty;
    @NotBlank
    private String notBlank;
    @Size(min = 2, max = 5)
    private String size;

}
