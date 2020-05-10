package com.chenjl.token.controller;

import com.chenjl.token.common.SchedulingToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/chenjlToken")
public class TokenContrller {

    @GetMapping("/getToken")
    public String getToken() {
        return "本时段令牌：" + SchedulingToken.getSchedulingToken();
    }

    @GetMapping("/booleanToken")
    public boolean booleanToken(@RequestParam String token) {
        return token .equals(SchedulingToken.getSchedulingToken()) ? true : false;
    }

}
