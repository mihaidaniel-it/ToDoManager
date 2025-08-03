package todo.manager.view;

import java.util.Scanner;

public class TaskManager {
    /**
     * @param hasChosen use for cycle while. Method will end while hasChosen = true
     * @author Daniel Mihai
     */
    Scanner scanner = new Scanner(System.in);
    private boolean hasChosen = false;


    /**
     * Method use data from user which he input from CLI
     * In fact of data method start operation
     */
    public void checkOperation() {
        while (!hasChosen) {
            System.out.println("Команда 'HELP' - выведет подсказки");
            System.out.print("Введите команду: ");
            String option = scanner.nextLine();

            String optionToLowerCase = option.toLowerCase();

            switch (optionToLowerCase) {
                case "add":
                    System.out.println("Выбрана команда: " + optionToLowerCase);
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