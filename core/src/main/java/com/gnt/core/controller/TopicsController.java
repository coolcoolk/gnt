package com.gnt.core.controller;

import com.gnt.core.domain.Topic;
import com.gnt.core.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("topics")
@RequiredArgsConstructor
public class TopicsController {

    private final TopicService topicService;

    @GetMapping
    public List<Topic> getTopics() {
        return topicService.getAllTopics();
    }

}
