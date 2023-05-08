package com.likelion11.springstudy.service;

import com.likelion11.springstudy.domain.Post;
import com.likelion11.springstudy.dto.PostResponseDTO;
import org.springframework.stereotype.Service;

// Dependency Injection
@Service
public class PostService {

    public Post createPost() { // Post는 내가 만든 도메인인 Post
        Post post = new Post();
        post.setId(1L);
        post.setTitle("스터디");
        post.setContent("스프링 재밌다..");
        return post;
    }

    public PostResponseDTO getPost(Long id) {
        Post post = createPost();

        PostResponseDTO dto = new PostResponseDTO(
                post.getId(), // 1L
                post.getTitle(), // 스터디
                post.getContent() // 스프링 재밌다..
        );
        return dto;

    }
}
