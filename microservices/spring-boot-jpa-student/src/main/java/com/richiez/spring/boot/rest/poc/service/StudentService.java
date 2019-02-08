package com.richiez.spring.boot.rest.poc.service;

import com.richiez.spring.boot.rest.poc.model.Student;

import java.util.Collection;

/**
 * Created by irichiez on 4/28/17.
 */
public interface StudentService {

    Collection<Student> getAllStudents();

    Student getStudentById(long id);

    void deleteStudent(Student student);

    void saveStudent(Student student);
}
