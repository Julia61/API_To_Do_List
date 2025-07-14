package br.com.julia.todolist.modules.controller;

import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.services.CreateTaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class CreateTaskController {

    private final CreateTaskService createTaskService;

    public CreateTaskController(CreateTaskService createTaskService) {
        this.createTaskService = createTaskService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@Valid @RequestBody RegisterTaskEntity registerTaskEntity) {
        var result = createTaskService.create(registerTaskEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
