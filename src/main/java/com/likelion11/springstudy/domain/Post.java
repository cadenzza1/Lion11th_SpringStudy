package com.likelion11.springstudy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    // 생성자, Getter, Setter
    // Spring POJO 지향 : Plain Old Java Object

    // 생성자 : 인스턴스 초기화 메소드
    // Getter : 인스턴스 변수를 get 하는 메서드
    // Setter : 인스턴스 변수를 set 하는 메서드

    // 2번째 숙제 : 왜 접근제어자를 private로 했을까?
    private Long id;
    private String title;
    private String content;

}
