package com.gnt.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myTopics")
@RequiredArgsConstructor
public class MyTopicsController {

    @GetMapping
    public String getMyTopics() {
        return "myTopics";
    }

}
