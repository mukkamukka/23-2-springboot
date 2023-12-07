package com.example.springshop.controller;

import com.example.springshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/layout")
    public String layout() {
        return "layout";
    }

    @GetMapping("userList")
    public String userList(Model model) {
        model.addAttribute("users", userService.getUserList());
        return "userList";
    }
}
