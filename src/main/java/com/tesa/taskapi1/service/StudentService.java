package com.tesa.taskapi1.service;

import com.tesa.taskapi1.model.entity.Student;
import com.tesa.taskapi1.model.request.StudentUpdateRequest;
import com.tesa.taskapi1.repository.Interface.StudentRepository;
import com.tesa.taskapi1.model.request.StudentCreateRequest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    public int createStudent(StudentCreateRequest request) {
        Gson gson = new Gson();
        var student = gson.fromJson(gson.toJson(request), Student.class);
        return studentRepository.createStudent(student);
    }

    public int updateStudent(StudentUpdateRequest request) {
        Gson gson = new Gson();
        var student = gson.fromJson(gson.toJson(request), Student.class);
        return studentRepository.updateStudent(student);
    }

    public int deleteStudentById(int id) {
        return studentRepository.deleteStudentById(id);
    }
}