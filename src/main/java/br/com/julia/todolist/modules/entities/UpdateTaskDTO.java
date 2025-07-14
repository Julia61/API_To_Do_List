package br.com.julia.todolist.modules.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UpdateTaskDTO {

    private String id;

    private String taskName;

    private String taskDescription;
}
