package org.jeecg.modules.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/hello")
public class HelloController {

    @GetMapping
    public String hi(String name) {
        return "Hi, " + name;
    }
}
