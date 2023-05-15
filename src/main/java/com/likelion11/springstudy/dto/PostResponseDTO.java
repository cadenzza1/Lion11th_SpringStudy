package com.likelion11.springstudy.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class PostResponseDTO {

    private Long id;

    private String title;
    private String content;
}
