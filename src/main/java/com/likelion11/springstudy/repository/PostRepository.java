package com.likelion11.springstudy.repository;

import com.likelion11.springstudy.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
