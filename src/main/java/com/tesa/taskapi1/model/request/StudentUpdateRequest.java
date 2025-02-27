package com.tesa.taskapi1.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentUpdateRequest {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentMatricNo;
    private String studentLevel;
    private String studentStatus;
}
