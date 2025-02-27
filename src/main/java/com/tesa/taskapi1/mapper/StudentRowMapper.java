package com.tesa.taskapi1.mapper;

import com.tesa.taskapi1.model.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Student.builder()
                .studentId(rs.getInt("studentId"))
                .studentName(rs.getString("studentName"))
                .studentAge(rs.getInt("studentAge"))
                .studentMatricNo(rs.getString("studentMatricNo"))
                .studentLevel(rs.getString("studentLevel"))
                .studentStatus(rs.getString("studentStatus"))
                .studentCreatedAt(rs.getString("studentCreatedAt"))
                .studentUpdatedAt(rs.getString("studentUpdatedAt"))
                .build();
    }
}
