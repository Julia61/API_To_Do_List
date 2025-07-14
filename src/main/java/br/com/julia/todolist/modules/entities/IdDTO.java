package br.com.julia.todolist.modules.entities;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class IdDTO {

    @NotNull(message = "Please enter a valid UUID")
    private UUID appleId;
}
