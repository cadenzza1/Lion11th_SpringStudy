package com.likelion11.springstudy.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@NoArgsConstructor(access = PROTECTED)
@Table(name= "post") // default값은 내가 지은 클래스이름을 소문자로 바꿔서 넣음
@Getter
// setter는 Entity에서 웬만하면 만들지 않는다. -> data 변형을 막기 위해, Entity계층에서는 위험함. 조심히 써야하므로 엔티티에선 세터 안 씀

public class Post {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    @Column(name="content") // -> 개발할 때는 postContent로 하고 실제 db에는 content로 저장하고 싶을 때 사용
    private String postContent;

    public Post(String title, String postContent) {
        this.title = title;
        this.postContent = postContent;
    }

// 생성자, Getter, Setter
    // Spring POJO 지향 : Plain Old Java Object

    // 생성자 : 인스턴스 초기화 메소드
    // Getter : 인스턴스 변수를 get 하는 메서드
    // Setter : 인스턴스 변수를 set 하는 메서드

    // 2번째 숙제 : 왜 접근제어자를 private로 했을까?


}
