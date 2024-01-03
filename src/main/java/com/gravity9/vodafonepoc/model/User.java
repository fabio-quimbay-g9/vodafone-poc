package com.gravity9.vodafonepoc.model;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Jacksonized
@Document(collection = "users")
public class User {
    @Id
    String id;
    String name;
    int age;
}