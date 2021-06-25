package by.statsenko.tasks;

import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        Controller controller = new Controller();

        List<Task> monday = controller.getMondayTasksList();

        int numberMenu;

        while (true) {
            try {
                numberMenu = Menu.getMenu();
                if (numberMenu > 3 | numberMenu < 1) {
                    System.out.println("Invalid number");
                    numberMenu = Menu.getMenu();
                }
                switch (numberMenu) {
                    case 1:
                        for (Task task : monday) {
                            System.out.println(task);
                        }
                        break;
                    case 2:
                        Scanner in1 = new Scanner(System.in);
                        String inputString = in1.nextLine();
                        Task newTask = new Task(inputString);
                        monday.add(newTask);
                        break;
                    case 3:
                        System.out.println("Good bue!");
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: failed to parse entered value. Try again: ");
            }
        }
    }
}
