package com.example.demo.domain.user;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  //무분별한 객체 생성에 대해 한번 더 체크
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //자동생성
    private Long id = null;

    @Column(nullable = false)   //not null이라는 뜻
    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}