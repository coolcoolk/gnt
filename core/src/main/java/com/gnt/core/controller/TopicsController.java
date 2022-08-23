package com.gnt.core.controller;

import com.gnt.core.domain.Topic;
import com.gnt.core.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("topics")
@RequiredArgsConstructor
public class TopicsController {

    private final TopicService topicService;

    @GetMapping
    public List<Topic> getTopics(@RequestParam(required = false) String id) {
        if(id != null) {
            List<Topic> topicDetail = new ArrayList<>();
            topicDetail.add(topicService.topicDetail(id));
            return topicDetail;
        }
        return topicService.getAllTopics();
    }
}
