package by.statsenko.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Task> monday = getMondayTasksList();
        int numberMenu = menuApp();

        if (numberMenu > 3 | numberMenu < 1) {
            System.out.println("Invalid number:");
            numberMenu = menuApp();
        }

        while (numberMenu > 0 & numberMenu < 4) {

            switch (numberMenu) {
                case 1:

                    for (Task task : monday) {
                        System.out.println(task);
                    }
                    numberMenu = menuApp();
                    break;
                case 2:
                    Scanner in1 = new Scanner(System.in);
                    String inputString = in1.nextLine();
                    Task newTask = new Task(inputString);
                    monday.add(newTask);
                    numberMenu = menuApp();
                    break;
                case 3:
                    System.out.println("Good bay");
                    System.exit(0);
                    break;
            }
        }
    }

    public static List<Task> getMondayTasksList() {
        List<Task> monday = new ArrayList();
        Task goShop = new Task("Go shop");
        Task sleepDay = new Task("Sleep day");
        Task studyBook = new Task("Study book");
        monday.add(goShop);
        monday.add(sleepDay);
        monday.add(studyBook);
        return monday;
    }

    public static int menuApp() {
        System.out.println("1. Show all tasks");
        System.out.println("2. Create new task");
        System.out.println("3. Finish work");
        Scanner in = new Scanner(System.in);
        System.out.println("Choose menu item by entering item number:");
        int numberMenu = in.nextInt();
        return numberMenu;
    }
}
