package com.gnt.core.service;

import com.gnt.core.domain.Tag;
import com.gnt.core.domain.Topic;
import com.gnt.core.repository.TagRepository;
import com.gnt.core.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    private final TagRepository tagRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public String createTopic(Topic topic) {
        topic.setCreatedTimestamp(new Date());
        topicRepository.save(topic);
        for (String tagName : topic.getTagNames()) {
            if (tagRepository.findByName(tagName) == null) {
                Tag tag = new Tag();
                tag.setName(tagName);
                tag.setNumberOfTopics(1);
                tagRepository.save(tag);
            } else {
                Tag tag = tagRepository.findByName(tagName);
                tag.setNumberOfTopics(tag.getNumberOfTopics() + 1);
                tagRepository.save(tag);
            }
        }
        return topic.getId();
    }

}
