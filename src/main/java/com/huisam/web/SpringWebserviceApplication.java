package com.huisam.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.sql.Time;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
public class SpringWebserviceApplication {

    // Spring Boot에서 TimeZone을 설정하기 위한 코드
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringWebserviceApplication.class, args);
    }

}
