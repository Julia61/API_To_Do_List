package br.com.julia.todolist.modules.controller;

import br.com.julia.todolist.modules.entities.IdDTO;
import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.services.ListAllTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/task")
public class ListAllTaskController {

    private final ListAllTaskService listAllTaskService;

    public ListAllTaskController(ListAllTaskService listAllTaskService) {
        this.listAllTaskService = listAllTaskService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<RegisterTaskEntity>> getAllTasks(@RequestParam UUID appleId) {
        List<RegisterTaskEntity> task = listAllTaskService.getTasks(appleId);
        return ResponseEntity.ok(task);
    }
}
