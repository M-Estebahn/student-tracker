package com.emo.studenttrackerbackend.repository;

import com.emo.studenttrackerbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
