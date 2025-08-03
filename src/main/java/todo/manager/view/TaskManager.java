package todo.manager.view;

import todo.manager.services.TaskService;

import java.util.Scanner;

public class TaskManager {
    /**
     * @param hasChosen use for cycle while. Method will end while hasChosen = true
     * @author Daniel Mihai
     */
    static Scanner scanner = new Scanner(System.in);
    private static boolean hasChosen = false;
    static TaskService taskService = new TaskService();


    /**
     * Method use data from user which he input from CLI
     * In fact of data method start operation
     */
    public static void checkOperation() {
        while (!hasChosen) {
            System.out.println("Команда 'HELP' - выведет подсказки");
            System.out.print("Введите команду: ");
            String option = scanner.nextLine();

            String optionToLowerCase = option.toLowerCase();

            switch (optionToLowerCase) {
                case "add":
                    taskService.addNewTask();
                    hasChosen = true;
                    break;
                case "show":
                    System.out.println("Выбрана команда: " + optionToLowerCase);
                    hasChosen = true;
                    break;
                case "showbypriority":
                    System.out.println("Выбрана команда: " + optionToLowerCase);
                    hasChosen = true;
                    break;
                case "edit":
                    System.out.println("Выбрана команда: " + optionToLowerCase);
                    hasChosen = true;
                    break;
                case "remove":
                    System.out.println("Выбрана команда: " + optionToLowerCase);
                    hasChosen = true;
                    break;
                default:
                    System.out.println("Такой команды не существует. Попробуйте еще раз");
            }
        }
    }
}