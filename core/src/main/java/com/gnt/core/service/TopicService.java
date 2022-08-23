package com.gnt.core.service;

import com.gnt.core.domain.Tag;
import com.gnt.core.domain.Topic;
import com.gnt.core.repository.TagRepository;
import com.gnt.core.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    private final TagRepository tagRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public String createTopic(Topic topic) {
        topic.setCreate_timestamp(new Date());
        topicRepository.save(topic);

        // Topic이 추가되었을 때 해당 Topic의 Tag가 존재하면 추가, 없으면 그대로

        for (String tagName : topic.getTags()) {
            System.out.println(tagRepository.findById(tagName)); //문자열 출력
            if (tagRepository.findById(tagName).isEmpty()) { // tagRepository.findById(tagName) == null 은 항상 false 반환 ...왜? // Optional.empty를 반환
                Tag tag = new Tag();
                tag.setId(tagName);
                tag.setCoin_sum(0);
                tagRepository.save(tag);
            }
        }
        return topic.getId();
    }

    public void changeTopic(Topic topic) { // 로직 : id를 찾아서 현재 있는 field는 그대로, 바뀐 field만 바꿔준다

        Topic topicBefore = topicRepository.findById(topic.getId()).get();
        System.out.println(topic.getId());
        System.out.println(topicBefore);

        // 좋은 방법이 떠오르지 않아 노가다로 구현 : field 업데이트 해줌
        if(topic.getRule_description() != null) topicBefore.setRule_description(topic.getRule_description());
        if(topic.getCreate_timestamp() != null) topicBefore.setCreate_timestamp(topic.getCreate_timestamp());
        if(topic.getBet_end_timestamp() != null) topicBefore.setBet_end_timestamp(topic.getBet_end_timestamp());
        if(topic.getResult_open_timestamp() != null) topicBefore.setResult_open_timestamp(topic.getResult_open_timestamp());
        if(topic.getTags() != null) topicBefore.setTags(topic.getTags());
        if(topic.getBet_info() != null) topicBefore.setBet_info(topic.getBet_info());
        if(topic.getResult() != null) topicBefore.setResult(topic.getResult());
        if(topic.getResult_canceled() != null) topicBefore.setResult_canceled(topic.getResult_canceled());
        if(topic.getResult_description() != null) topicBefore.setResult_description(topic.getResult_description());

        topicRepository.save(topicBefore);
    }

    public void deleteTopic(String id){ // 삭제
        topicRepository.deleteById(id);
    }
}
