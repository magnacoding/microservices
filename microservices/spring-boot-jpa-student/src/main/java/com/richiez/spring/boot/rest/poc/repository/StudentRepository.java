package com.richiez.spring.boot.rest.poc.repository;

import com.richiez.spring.boot.rest.poc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by irichiez on 4/28/17.
 */

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
