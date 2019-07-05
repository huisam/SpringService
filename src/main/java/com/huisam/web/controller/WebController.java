package com.huisam.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/") // templates 폴더안의 .hbs된 파일을 알아서 찾아서 매핑함
    public String main() {
        return "main";
    }
}
