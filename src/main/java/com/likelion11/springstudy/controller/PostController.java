package com.likelion11.springstudy.controller;

import com.likelion11.springstudy.dto.PostCreateRequestDTO;
import com.likelion11.springstudy.dto.PostResponseDTO;
import com.likelion11.springstudy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts") // 기본 url 명세
public class PostController {
    private final PostService postService;
    // 생성 API
    @PostMapping()
    public String createPost(@RequestBody PostCreateRequestDTO dto) {
        postService.create(dto);
        return "OK";
    }

    // 조회 API -> 단 건 조회, 목록 조회 ... 여기선 단 건 조회
    // GET ~/api/posts/{postId}
    @GetMapping("/{postId}")
    public PostResponseDTO getPost(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

}