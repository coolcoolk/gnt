package com.gnt.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
@RequiredArgsConstructor
public class ParamsController {

    @GetMapping
    public String getParams() {
        return "params";
    }

}
