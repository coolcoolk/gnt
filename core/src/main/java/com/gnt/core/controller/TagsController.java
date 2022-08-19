package com.gnt.core.controller;

import com.gnt.core.domain.Tag;
import com.gnt.core.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tags")
@RequiredArgsConstructor
public class TagsController {

    private final TagService tagService;

    @GetMapping
    public List<Tag> getTags() {
        return tagService.getAllTags();
    }

}
