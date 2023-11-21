package com.zanahtech.blogdemo.repository;

import com.zanahtech.blogdemo.domain.Comment;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface CommentRepository extends CrudRepository<Comment, UUID> {


    }

