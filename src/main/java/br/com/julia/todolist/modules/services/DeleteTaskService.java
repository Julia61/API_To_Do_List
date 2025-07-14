package br.com.julia.todolist.modules.services;

import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.execeptions.TaskNotFoundException;
import br.com.julia.todolist.modules.repository.RegisterTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskService {

    private final RegisterTaskRepository registerTaskRepository;

    public DeleteTaskService(RegisterTaskRepository registerTaskRepository) {
        this.registerTaskRepository = registerTaskRepository;
    }

    public void deleteTask(String id) {
        RegisterTaskEntity registerTaskEntity = registerTaskRepository.findById(id)
                .orElseThrow(TaskNotFoundException::new);

        registerTaskRepository.deleteById(id);
    }
}
