package br.com.julia.todolist.modules.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "registerTask")
public class RegisterTaskEntity {

    @Id
    private String id;

    @NotNull(message = "Please enter a valid UUID")
    private UUID appleId;

    @NotBlank(message = "Please enter a valid name")
    private String taskName;

    @NotBlank(message = "Please enter a valid description")
    private String taskDescription;


}
