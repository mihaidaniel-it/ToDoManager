package todo.manager.repository;

import todo.manager.services.model.Task;

import java.util.ArrayList;

public class Tasks {
    /**
     * @param tasks used for storing object of class Task
     *              We can store object and use them in class TaskService
     */
    ArrayList<Task> tasks = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
