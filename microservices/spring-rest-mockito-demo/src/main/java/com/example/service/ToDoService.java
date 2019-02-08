package com.example.service;

import com.example.model.ToDo;

import java.util.List;

/**
 * Service Layer
 * Now let´s create our service layer(interface and implementation).
 * We will inject the repository into the service
 */
public interface ToDoService {
    public List<ToDo> getAllToDo();
    public ToDo getToDoById(long id);
    public ToDo saveToDo(ToDo todo);
    public void removeToDo(ToDo todo);
}
