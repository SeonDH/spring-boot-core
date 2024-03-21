package org.example.properties;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ConfigurationProperties("date")
@Validated
public class DateProperties {
    @Future
    private LocalDate future;
    @Past
    private LocalDate past;
}
