package com.zanahtech.blogdemo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="comment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue()
    private UUID id;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String description;
    private Date createdDate;
    @Column(nullable = false)
    private String createdBy;private Date updatedDate;
}
