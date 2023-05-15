package com.likelion11.springstudy.service;

import com.likelion11.springstudy.domain.Post;
import com.likelion11.springstudy.dto.PostCreateRequestDTO;
import com.likelion11.springstudy.dto.PostResponseDTO;
import com.likelion11.springstudy.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@org.springframework.transaction.annotation.Transactional
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public void create(PostCreateRequestDTO dto) {
        // 여기서 생성 로직을 짜야함
        // 근데 DB호출은 서비스에서 안 하고 레포지토리에서 함
        Post post = new Post(dto.getTitle(), dto.getContent()); // 게시글 인스턴스 생성
        // 생성은 했고 DB에 저장을 해야 함 -> 서비스에서 안 하고 레포지토리에서 한다. 레포지토리로 가자!
        postRepository.save(post);
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public PostResponseDTO getPost(Long id) {
        // id를 기준으로 DB에서 데이터를 찾아온다.
        Post post = postRepository.findById(id).get(); // 빨간 줄이 뜨는 이유 : Null을 리턴할 수도 있어서
        return new PostResponseDTO(post.getId(), post.getTitle(), post.getPostContent());
    }

}

