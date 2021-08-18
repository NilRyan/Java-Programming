
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class UserInterface {

    private TodoList todos;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add");
                String todo = scanner.nextLine();
                todos.add(todo);
            }

            if (command.equals("list")) {
                todos.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                todos.remove(index);

            }

        }
    }
}
