package com.tesa.taskapi1.controller;

import com.tesa.taskapi1.model.entity.Student;
import com.tesa.taskapi1.model.request.StudentCreateRequest;
import com.tesa.taskapi1.model.request.StudentUpdateRequest;
import com.tesa.taskapi1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create-student")
    public ResponseEntity<String> createStudent(@RequestBody StudentCreateRequest request) {
        var resp = studentService.createStudent(request);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student failed to create");
        return ResponseEntity.ok("Student created successfully");
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/get-by-id/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PutMapping("/update-student")
    public ResponseEntity<String> updateStudent(@RequestBody StudentUpdateRequest request) {
        var resp = studentService.updateStudent(request);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student failed to update");
        return ResponseEntity.ok("Student updated successfully");
    }

    @DeleteMapping("/delete-by-id/{studentId}")
    public ResponseEntity<String> deleteStudentById(@PathVariable int studentId) {
        var resp = studentService.deleteStudentById(studentId);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student failed to delete");
        return ResponseEntity.ok("Student deleted successfully");
    }
}