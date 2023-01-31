package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
// import org.springframework.data.repository.JpaRepository;

public interface PostRepository extends org.springframework.data.jpa.repository.JpaRepository<Post, Long>{
}