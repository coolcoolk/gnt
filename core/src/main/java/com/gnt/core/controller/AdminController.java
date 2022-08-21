package com.gnt.core.controller;

import com.gnt.core.domain.Topic;
import com.gnt.core.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
public class AdminController {
    // Github test

    private final TopicService topicService;

    @PostMapping("topics")
    public String createTopic(@RequestBody Topic topic) {
        topicService.createTopic(topic);
        return "success";
    }

}
