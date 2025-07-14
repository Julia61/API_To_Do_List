package br.com.julia.todolist.modules.controller;


import br.com.julia.todolist.modules.services.DeleteTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class DeleTaskController {

    private final DeleteTaskService deleteTaskService;

    public DeleTaskController(DeleteTaskService deleteTaskService) {
        this.deleteTaskService = deleteTaskService;

    }

    @DeleteMapping("/deleteTask/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable String id){
        deleteTaskService.deleteTask(id);
        return ResponseEntity.ok("Task deleted");
    }
}
