package com.huisam.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebControllerTest {

    // Spring5부터 도입된 webTestClient는 웹브라우저에 대한 Http 메서드들을 이용할 수 있다.
    // 단 build.gradle에 import를 하여 라이브러리를 가져와야한다!!
    // spring-boot-starter-webflux 라이브러리를 import에 추가한다!
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void MainPage_Loading() {
        webTestClient.get()
                .uri("/")
                .exchange()
                .expectStatus().isOk();
    }
}