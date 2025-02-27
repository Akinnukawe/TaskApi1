package com.tesa.taskapi1.repository.Interface;

import com.tesa.taskapi1.model.entity.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();

    Student getStudentById(int studentId);

    int createStudent(Student student);

    int updateStudent(Student student);

    int deleteStudentById(int studentId);
}
