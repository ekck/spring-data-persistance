package com.zanahtech.blogdemo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import java.util.Date;
import java.util.UUID;


@Data
@Builder
public class CommentDTO {
    private UUID id;
    private String userId;
    @NotNull(message = "comment cannot be empty")
    private String description;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
}