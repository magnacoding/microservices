package com.spring.mock.json.sample.service;

import com.spring.mock.json.sample.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student findById(int id);

    Student findByName(String name);

    void create(Student user);

    void update(Student user);

    void delete(int id);

    boolean exists(Student user);
}
