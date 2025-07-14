package br.com.julia.todolist.modules.services;

import br.com.julia.todolist.modules.entities.IdDTO;
import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import br.com.julia.todolist.modules.repository.RegisterTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ListAllTaskService {

    private final RegisterTaskRepository registerTaskRepository;

    public ListAllTaskService(RegisterTaskRepository registerTaskRepository) {
        this.registerTaskRepository = registerTaskRepository;
    }

    public List<RegisterTaskEntity> getTasks(IdDTO idDTO) {
        return registerTaskRepository.findAllByAppleId(idDTO.getAppleId());
    }
}
