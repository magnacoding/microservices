package com.example.repository;

import com.example.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Data Layer (JPA Repository)
 * Now we are going to create our JPA repository using the ToDo class
 */

@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}