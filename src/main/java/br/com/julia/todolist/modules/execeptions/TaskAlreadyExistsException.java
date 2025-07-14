package br.com.julia.todolist.modules.execeptions;

public class TaskAlreadyExistsException extends RuntimeException {
    public TaskAlreadyExistsException() {
        super("Task already exists");
    }
}
