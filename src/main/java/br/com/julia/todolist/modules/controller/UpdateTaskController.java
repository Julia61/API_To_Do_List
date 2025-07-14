package br.com.julia.todolist.modules.controller;

import br.com.julia.todolist.modules.entities.UpdateTaskDTO;
import br.com.julia.todolist.modules.services.UpdateTaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class UpdateTaskController {

    private final UpdateTaskService updateTaskService;

    public UpdateTaskController(UpdateTaskService updateTaskService) {
        this.updateTaskService = updateTaskService;
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@Valid @RequestBody UpdateTaskDTO updateTaskDTO) {

        var result = updateTaskService.UpdateTask(updateTaskDTO);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
