package com.gnt.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "tags")
public class Tag {

    @Id
    private String id; // 태그 이름

    private Integer coin_sum; // 태그에 배팅된 코인 총량
}
