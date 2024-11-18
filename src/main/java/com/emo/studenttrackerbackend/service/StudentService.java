package com.emo.studenttrackerbackend.service;

import com.emo.studenttrackerbackend.model.Student;
import com.emo.studenttrackerbackend.repository.ParentRepository;
import com.emo.studenttrackerbackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final ParentRepository parentRepository;

    public StudentService(StudentRepository studentRepository, ParentRepository parentRepository) {
        this.studentRepository = studentRepository;
        this.parentRepository = parentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        if (student.isMinor() && student.getParent() != null) {
            parentRepository.save(student.getParent());
        }
        return studentRepository.save(student);
    }
}