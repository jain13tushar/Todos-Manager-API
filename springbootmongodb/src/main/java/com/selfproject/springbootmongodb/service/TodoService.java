package com.selfproject.springbootmongodb.service;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.stereotype.Service;

import com.selfproject.springbootmongodb.exception.TodoCollectionException;
import com.selfproject.springbootmongodb.model.TodoDTO;

@Service
public interface TodoService {

	public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;

	public List<TodoDTO> getAllTodos();

	public TodoDTO getSingleTodo(String id) throws TodoCollectionException;

	public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;

	public void deleteTodo(String id) throws TodoCollectionException;

}
