package com.example.demo;

import com.example.demo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD create ,read, update, delete
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
