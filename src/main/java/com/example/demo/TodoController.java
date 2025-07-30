package com.example.demo;

import com.example.demo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;


    //path variable
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id){

        try{
            Todo createTodo = todoService.getTodoById(id);
            return new ResponseEntity<>(createTodo,HttpStatus.OK);
        } catch (RuntimeException exception) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(todoService.getTodos(), HttpStatus.OK);
    }

    //request param

    @PostMapping("/create")
    ResponseEntity<Todo> createUser(@RequestBody Todo todo){
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @PutMapping
    ResponseEntity<Todo> updateTodoById(@RequestBody Todo todo){
      return new ResponseEntity<>(todoService.updateTodo(todo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteTodoById(@PathVariable long id){
        todoService.deleteTodoById(id);
    }
}
