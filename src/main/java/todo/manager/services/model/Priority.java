package todo.manager.services.model;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    public static boolean checkPriority(String priority) {
        for (Priority i : Priority.values()) {
            if (i.name().equals(priority)) {
                return true;
            }
        }

        return false;
    }
}
