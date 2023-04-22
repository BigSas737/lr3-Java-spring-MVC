package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import students.Student;

public interface StudentRepository {
    void save(Student student);

    public interface studentRepository extends JpaRepository<Student,Long> {}
}
