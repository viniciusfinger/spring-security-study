package com.viniciusfinger.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/me")
    public String getMyLoans(){
        return "My loans mock";
    }
}
