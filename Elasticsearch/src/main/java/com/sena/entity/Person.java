package com.sena.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "person")
public class Person {

    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "lastname", type = FieldType.Text)
    private String lastname;

    @Field(name = "address", type = FieldType.Text)
    private String address;

    @Field(name = "birthday", type = FieldType.Date)
    private Date birthday;
}