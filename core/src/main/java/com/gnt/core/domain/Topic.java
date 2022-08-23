package com.gnt.core.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "topics")
public class Topic {

    @Id
    private String id;
    private String name;
    private String rule_description;
    private Date create_timestamp;
    private Date bet_end_timestamp;
    private Date result_open_timestamp;
    private List<String> tags;
    private List<Map<String, Object>> bet_info;
    private String result;
    private Boolean result_canceled;
    private String result_description;
}
