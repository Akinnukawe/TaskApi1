package com.tesa.taskapi1.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCreateRequest {
    private String studentName;
    private int studentAge;
    private String studentMatricNo;
    private String studentLevel;
}
