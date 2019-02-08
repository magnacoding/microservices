package com.spring.mock.json.sample.service;

import main.com.javacodegeeks.enterprise.rest.resteasy.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserServiceImpl implements StudentService {

    private static final AtomicInteger counter = new AtomicInteger();
    private static List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(counter.incrementAndGet(), "Inocencio Richiez"),
                    new Student(counter.incrementAndGet(), "Ellen Oprea"),
                    new Student(counter.incrementAndGet(), "Sumithra Reddy"),
                    new Student(counter.incrementAndGet(), "Srini Nandina")));

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByName(String name) {
        for (Student student : students){
            if (student.getUsername().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void create(Student user) {
        user.setId(counter.incrementAndGet());
        students.add(user);
    }

    @Override
    public void update(Student user) {
        int index = students.indexOf(findById(user.getId()));
        students.set(index, user);
    }

    @Override
    public void delete(int id) {
        Student user = findById(id);
        students.remove(user);
    }

    @Override
    public boolean exists(Student user) {
        return findByName(user.getUsername()) != null;
    }

}
