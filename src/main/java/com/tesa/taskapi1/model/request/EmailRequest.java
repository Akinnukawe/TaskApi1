package com.tesa.taskapi1.model.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmailRequest {
    private List<String> recipientEmails;
    private String subject;
    private String message;
}
