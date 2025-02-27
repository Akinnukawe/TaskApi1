package com.tesa.taskapi1.repository.Implementation;

import com.tesa.taskapi1.mapper.StudentRowMapper;
import com.tesa.taskapi1.model.entity.Student;
import com.tesa.taskapi1.repository.Interface.StudentRepository;
import com.tesa.taskapi1.repository.Query.StudentQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> getAllStudents() {
        return jdbcTemplate.query(StudentQuery.GET_ALL, new StudentRowMapper());
    }

    @Override
    public Student getStudentById(int studentId) {
        MapSqlParameterSource params = new MapSqlParameterSource("studentId", studentId);
        return jdbcTemplate.queryForObject(StudentQuery.GET_BY_ID, params, new StudentRowMapper());
    }

    @Override
    public int createStudent(Student student) {
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("studentName", student.getStudentName())
                .addValue("studentAge", student.getStudentAge())
                .addValue("studentMatricNo", student.getStudentMatricNo())
                .addValue("studentLevel", student.getStudentLevel())
                .addValue("studentStatus", student.getStudentStatus());
        return jdbcTemplate.update(StudentQuery.INSERT_STUDENT, params);
    }

    @Override
    public int updateStudent(Student student) {
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("studentId", student.getStudentId())
                .addValue("studentName", student.getStudentName())
                .addValue("studentAge", student.getStudentAge())
                .addValue("studentMatricNo", student.getStudentMatricNo())
                .addValue("studentLevel", student.getStudentLevel())
                .addValue("studentStatus", student.getStudentStatus());
        return jdbcTemplate.update(StudentQuery.UPDATE_STUDENT, params);
    }

    @Override
    public int deleteStudentById(int studentId) {
        MapSqlParameterSource params = new MapSqlParameterSource("studentId", studentId);
        return jdbcTemplate.update(StudentQuery.DELETE_BY_ID, params);
    }
}
