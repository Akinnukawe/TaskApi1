package com.tesa.taskapi1.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentMatricNo;
    private String studentLevel;
    private String studentStatus;
    private String studentCreatedAt;
    private String studentUpdatedAt;
}
