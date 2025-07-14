package br.com.julia.todolist.modules.services;

import br.com.julia.todolist.modules.entities.RegisterTaskEntity;

import br.com.julia.todolist.modules.repository.RegisterTaskRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateTaskService {

    private final RegisterTaskRepository registerTaskRepository;

    public CreateTaskService(RegisterTaskRepository registerTaskRepository) {
        this.registerTaskRepository = registerTaskRepository;
    }

    public RegisterTaskEntity create(RegisterTaskEntity registerTaskEntity) {

        return registerTaskRepository.save(registerTaskEntity);
    }
}
