package com.atacanyavuz.databasesystems.repository.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Message {
    @Id
    private String id;
    private Integer definer;
    private String val1;
    private String val2;
}
