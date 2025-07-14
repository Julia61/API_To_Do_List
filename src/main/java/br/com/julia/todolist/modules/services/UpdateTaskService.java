package br.com.julia.todolist.modules.services;

import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.entities.UpdateTaskDTO;
import br.com.julia.todolist.modules.repository.RegisterTaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateTaskService {

    private final RegisterTaskRepository registerTaskRepository;


    public UpdateTaskService(RegisterTaskRepository registerTaskRepository) {
        this.registerTaskRepository = registerTaskRepository;
    }

    public RegisterTaskEntity UpdateTask(UpdateTaskDTO updateTaskDTO) {
        Optional<RegisterTaskEntity> optionalTask  = this.registerTaskRepository.findById(updateTaskDTO.getId());

        if (optionalTask .isEmpty()) {
            throw new RuntimeException("Task not found with id: " + updateTaskDTO.getId());
        }

        RegisterTaskEntity task = optionalTask.get();
        task.setTaskName(updateTaskDTO.getTaskName());
        task.setTaskDescription(updateTaskDTO.getTaskDescription());

        return registerTaskRepository.save(task);

    }
}
