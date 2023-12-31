package com.zanahtech.blogdemo.service;
import com.zanahtech.blogdemo.domain.Comment;
import com.zanahtech.blogdemo.dto.CommentDTO;
import com.zanahtech.blogdemo.repository.CommentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    public void saveComment(CommentDTO commentDTO) {
    Comment comment = Comment
            .builder()
            .description(commentDTO.getDescription())
            .createdDate(new Date())
            .createdBy(commentDTO.getCreatedBy())
            .userId("1")
            .build();
    commentRepository.save(comment);
}
    public List<CommentDTO> getAllComments(){
        Iterable<Comment> comments = commentRepository.findAll();
        List<CommentDTO> commentsDTO = new ArrayList<>();

        comments.forEach( comment -> {
            commentsDTO.add(CommentDTO
                    .builder()
                    .userId(comment.getUserId())
                    .description(comment.getDescription())
                    .createdBy(comment.getCreatedBy())
                    .createdDate(comment.getCreatedDate())
                    .build());
        });
        return commentsDTO;
    }}