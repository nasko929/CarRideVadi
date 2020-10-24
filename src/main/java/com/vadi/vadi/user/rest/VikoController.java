package com.vadi.vadi.user.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VikoController {

    @RequestMapping("/login")
    public String getLoginPage() {
        return "loginpage";
    }
}
