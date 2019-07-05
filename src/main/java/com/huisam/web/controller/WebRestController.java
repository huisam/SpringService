package com.huisam.web.controller;

import com.huisam.web.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor // 필드의 생성자를 지정해주는 어노테이션
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/posts")
    public long savePosts(@RequestBody PostsSaveRequestsDto dto) {
        return postsService.save(dto);
    }
}
