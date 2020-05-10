package com.chenjl.nginxtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chenjlNginx")
public class NginxController {

    @GetMapping("/getPort")
    public String getPort() {
        return "这是8084端口";
    }
}
