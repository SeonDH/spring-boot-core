package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

//TODO-1 @EnableAsync 는 @Configuration 가 붙은 클래스에 1회 선언한다. (자동구성)
@EnableAsync
@Configuration
public class ExecutorConfig {

    //TODO-2 TaskExecutor Bean 생성
    @Bean
    public TaskExecutor customExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(500);
        executor.initialize();
        return executor;
    }
}