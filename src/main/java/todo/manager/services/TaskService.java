package todo.manager.services;

import todo.manager.repository.Tasks;
import todo.manager.services.model.Priority;
import todo.manager.services.model.Task;
import todo.manager.services.model.TaskStatus;
import todo.manager.view.TaskManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {
    Scanner scanner = new Scanner(System.in);
    Tasks tasks = new Tasks();
    private int allTasks = 0;

    public void addNewTask() {
//        Ввод данных
        System.out.print("Введите заголовок: ");
        String header = scanner.nextLine();

        System.out.print("Введите описание (опционально): ");
        String description = scanner.nextLine();

        if (description.length() < 2 || description.length() > 20) {
            System.out.println();
            System.out.println("- Описание задачи должно быть в диапазоне от 2 от 20 символов");
            addNewTask();
        }

        System.out.print("Введите приоритет [Low, Medium, High]: ");
        String priorityFromUser = scanner.next();
        String priorityFromUserUpperCase = priorityFromUser.toUpperCase();

        boolean isCorrectPriority = Priority.checkPriority(priorityFromUserUpperCase);
        if (!isCorrectPriority) {
            System.out.println();
            System.out.println("- Вы неверно указали приоритет задачи!");
            addNewTask();
        }

        System.out.print("Введите статус задачи [Todo, InProgress, Done]: ");
        scanner.nextLine();
        String taskStatusFromUser = scanner.nextLine();
        String taskStatusFromUserUpperCase = taskStatusFromUser.toUpperCase();

        boolean isCorrectTaskStatus = TaskStatus.checkTaskStatus(taskStatusFromUserUpperCase);
        if (!isCorrectTaskStatus) {
            System.out.println();
            System.out.println("- Вы неверно указали статус задачи!");
            addNewTask();
        }

//        Добавление объекта в репозиторий
        LocalDateTime dateOfCreation = LocalDateTime.now();
        int id = allTasks;
        Priority priorityUpperCase = Priority.valueOf(priorityFromUser.toUpperCase());
        TaskStatus taskStatusUpperCase = TaskStatus.valueOf(taskStatusFromUser.toUpperCase());

        ArrayList<Task> tempTasks = new ArrayList<>();
        Task newTask = new Task(id, header, description, priorityUpperCase, taskStatusUpperCase, dateOfCreation);
        tempTasks.add(newTask);
        tasks.setTasks(tempTasks);
        allTasks++;

        System.out.println(tasks.getTasks());

        System.out.println("Задача успешно добавлена!");
        TaskManager.checkOperation();
    }
}
