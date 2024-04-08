package ru.itmentor.spring.boot_security.demo.controllers;

import ru.itmentor.spring.boot_security.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model, Principal principal) {
        model.addAttribute("users", userService.getUserByUsername(principal.getName()));
        return "index";
    }
}

