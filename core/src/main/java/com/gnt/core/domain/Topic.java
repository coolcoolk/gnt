package com.gnt.core.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "topics")
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;
    private Date createdTimestamp;
    private List<String> tagNames;

}
