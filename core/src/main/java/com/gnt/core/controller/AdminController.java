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
    // Github test!!!!

    private final TopicService topicService;

    @PostMapping("topic/add")
    public String createTopic(@RequestBody Topic topic) {
        topicService.createTopic(topic);
        return "success";
    }

    @PostMapping("topic/change")
    public String changeTopic(@RequestBody Topic topic){
        topicService.changeTopic(topic);
        return "success";
    }

    @PostMapping("topic/delete")
    public String deleteTopic(@RequestBody String id){
        return "success";
    }

}
