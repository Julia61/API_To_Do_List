package br.com.julia.todolist.modules.services;

import br.com.julia.todolist.modules.entities.IdDTO;
import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.repository.RegisterTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class ListAllTaskService {

    private final RegisterTaskRepository registerTaskRepository;

    public ListAllTaskService(RegisterTaskRepository registerTaskRepository) {
        this.registerTaskRepository = registerTaskRepository;
    }

    public List<RegisterTaskEntity> getTasks(UUID appleId) {
        return registerTaskRepository.findAllByAppleId(appleId);
    }
}
