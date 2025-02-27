package com.tesa.taskapi1.repository.Query;

public class StudentQuery {

    public static final String INSERT_STUDENT = """
        INSERT INTO Student (studentName, studentAge, studentMatricNo, studentLevel)
        VALUES (:studentName, :studentAge, :studentMatricNo, :studentLevel)
    """;

    public static final String GET_ALL = "SELECT * FROM Student";

    public static final String GET_BY_ID = "SELECT * FROM Student WHERE studentId = :studentId";

    public static final String UPDATE_STUDENT = """
        UPDATE Student
        SET studentName = :studentName,
            studentAge = :studentAge,
            studentMatricNo = :studentMatricNo,
            studentLevel = :studentLevel,
            studentStatus = :studentStatus,
            studentUpdatedAt = GETDATE()
        WHERE studentId = :studentId
    """;

    public static final String DELETE_BY_ID = "DELETE FROM Student WHERE studentId = :studentId";

}

