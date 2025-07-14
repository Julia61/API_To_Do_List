package br.com.julia.todolist.modules.repository;

import br.com.julia.todolist.modules.entities.RegisterTaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import java.util.UUID;

public interface RegisterTaskRepository extends MongoRepository<RegisterTaskEntity, String> {
    List<RegisterTaskEntity> findAllByAppleId(UUID appleId);
}
