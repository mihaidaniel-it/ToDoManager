package todo.manager.services.model;

import java.time.LocalDateTime;

public record Task(
        int id,
        String header,
        String description,
        Priority priority,
        TaskStatus taskStatus,
        LocalDateTime dateOfCreation) {
}
