package com.likelion11.springstudy.controller;

import com.likelion11.springstudy.domain.Post;
import com.likelion11.springstudy.dto.PostResponseDTO;
import com.likelion11.springstudy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//URL Mapping. Client에서 들어오는 요청에 문지기 역할
@RestController
// django의 include와 동일
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor
public class PostAPIController {

    // Dependency Injection
    // 1. 생성자 주입
    // 2. @Autowired 주입
    // 3. Setter 주입
    private final PostService postService;

    // 생성 API
    // POST /api/v1/post
    @PostMapping("/post")
    public Map<String,String> createPost() {

        Post post = postService.createPost();

        Map<String, String> map = new HashMap<>();
        map.put("status", "200");
        map.put("message", "OK");
        map.put("data", post.toString());
        return map;
    }

    // 조희 API
    @GetMapping("/post/{postId}")
    // 어쨌든 Post 객체 리턴하는건데 그대로 리턴하면 도메인 노출돼서 위험하니까 PostResponseDTO를 리턴하는거임
    public PostResponseDTO getPost(@PathVariable("postId") Long id) {
        return postService.getPost(id);
    }

}
