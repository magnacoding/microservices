package com.richiez.spring.boot.rest.poc.controller;

import com.richiez.spring.boot.rest.poc.model.Student;
import com.richiez.spring.boot.rest.poc.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by irichiez on 4/27/17.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }
}
