package com.richiez.spring.boot.rest.poc.service;

import com.richiez.spring.boot.rest.poc.model.Student;
import com.richiez.spring.boot.rest.poc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by irichiez on 4/27/17.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    //@Qualifier("simpleData")
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

}
