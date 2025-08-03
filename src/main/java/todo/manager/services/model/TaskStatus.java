package todo.manager.services.model;

public enum TaskStatus {
    TODO,
    IN_PROGRESS,
    DONE;

    public static boolean checkTaskStatus(String taskStatus) {
        for (TaskStatus i : TaskStatus.values()) {
            if (i.name().equals(taskStatus)) {
                return true;
            }
        }

        return false;
    }
}