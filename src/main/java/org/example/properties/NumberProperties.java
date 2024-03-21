package org.example.properties;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@Getter
@ConfigurationProperties("number")
@Validated
public class NumberProperties {

    @Min(10)
    private Integer min;
    @Max(20)
    private Integer max;
    @Positive
    private Integer positive;
    @Negative
    private Integer negative;
}
