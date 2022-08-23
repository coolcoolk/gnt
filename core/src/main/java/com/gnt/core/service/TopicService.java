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
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    private final TagRepository tagRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public String createTopic(Topic topic) {
        topic.setCreate_timestamp(new Date()); // 생성날짜 기록 : 추후 string으로 수정
        topicRepository.save(topic); // Topic 저장

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
        return "Success";
    }

    public void changeTopic(Topic topic) { // 로직 : id를 찾아서 현재 있는 field는 그대로, 바뀐 field만 바꿔준다

        // 같은 이름을 가진 Topic들 읽음
        List<Topic> topicsBefore = topicRepository.findByName(topic.getName());

        // 수정할 Topic 담을 객체 생성
        Topic topicBefore = new Topic();
        
        // 기준은 여러 가지로 달라질 수 있지만, 생성 날짜를 기준으로 함 => 따라서 입력할 때 생성 날짜는 입력해줘야 함 / 굳이..?
        for (Topic topicCandidate : topicsBefore ){
            System.out.println(topicCandidate.getCreate_timestamp());
            System.out.println("!!!!!");
            System.out.println(topic.getCreate_timestamp());

            if(topicCandidate.getCreate_timestamp().equals(topic.getCreate_timestamp())){
                System.out.println("!!!!!");
                topicBefore = topicCandidate;
                System.out.println(topicCandidate.getId());
            }
        }

        // 테스트 print
        System.out.println(topic.getName());
        System.out.println(topicBefore);
        System.out.println(topicBefore.getId());

        // 좋은 방법이 떠오르지 않아 노가다로 구현 : field 업데이트 해줌
        if(topic.getName() != null) topicBefore.setName(topic.getName());
        if(topic.getRule_description() != null) topicBefore.setRule_description(topic.getRule_description());
        if(topic.getCreate_timestamp() != null) topicBefore.setCreate_timestamp(topic.getCreate_timestamp());
        if(topic.getBet_end_timestamp() != null) topicBefore.setBet_end_timestamp(topic.getBet_end_timestamp());
        if(topic.getResult_open_timestamp() != null) topicBefore.setResult_open_timestamp(topic.getResult_open_timestamp());
        if(topic.getTags() != null) topicBefore.setTags(topic.getTags());
        if(topic.getBet_info() != null) topicBefore.setBet_info(topic.getBet_info());
        if(topic.getResult() != null) topicBefore.setResult(topic.getResult());
        if(topic.getResult_canceled() != null) topicBefore.setResult_canceled(topic.getResult_canceled());
        if(topic.getResult_description() != null) topicBefore.setResult_description(topic.getResult_description());
        
        // 몽고디비는 id 값을 찾아서 같으면 update, 다르면 set 해줌
        topicRepository.save(topicBefore);
    }

    public void deleteTopic(String id){
        // 삭제  // 가 왜 안 되지...?
        System.out.println(id);
        topicRepository.deleteById(id);
    }

    public Topic topicDetail(String id){
        return topicRepository.findById(id).get();
    }
}
