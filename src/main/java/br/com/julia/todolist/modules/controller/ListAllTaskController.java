package br.com.julia.todolist.modules.controller;

import br.com.julia.todolist.modules.entities.IdDTO;
import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.services.ListAllTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class ListAllTaskController {

    private final ListAllTaskService listAllTaskService;

    public ListAllTaskController(ListAllTaskService listAllTaskService) {
        this.listAllTaskService = listAllTaskService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<RegisterTaskEntity>> getAllTasks(@RequestBody IdDTO idDTO) {
        List<RegisterTaskEntity> task = listAllTaskService.getTasks(idDTO);
        return ResponseEntity.ok(task);
    }
}
