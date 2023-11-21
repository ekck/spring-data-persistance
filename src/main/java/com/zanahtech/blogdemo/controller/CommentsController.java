package com.zanahtech.blogdemo.controller;

import com.zanahtech.blogdemo.dto.CommentDTO;
import com.zanahtech.blogdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    CommentService commentService;
    @PostMapping()
public ResponseEntity<CommentDTO> createComment(
       @RequestBody CommentDTO commentDTO)
        throws Exception {

    commentDTO.setCreatedDate(new Date());
    commentDTO.setCreatedBy("zanadev@gmail.com");

    commentService.saveComment(commentDTO);
    return new ResponseEntity<>(commentDTO, HttpStatus.CREATED);
}
    @GetMapping(
            )
    public ResponseEntity<List<CommentDTO>> getComments()
            throws Exception {

        List<CommentDTO> commentsDTO = commentService.getAllComments();
        return new ResponseEntity<>(commentsDTO, HttpStatus.CREATED);
    }}