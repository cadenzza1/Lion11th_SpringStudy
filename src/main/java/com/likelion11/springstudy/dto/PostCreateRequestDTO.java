package com.likelion11.springstudy.dto;

import lombok.Data;

@Data
// request body로 들어감
public class PostCreateRequestDTO {

    // JSON key값이 되는 필드들
    // {
    //    "title" : "제목",
    //    "content" : "내용",
    // }
    private String title;
    private String content;
}
