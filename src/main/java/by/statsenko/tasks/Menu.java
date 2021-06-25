package by.statsenko.tasks;

import java.util.Scanner;

public class Menu {
    public static int getMenu() {
        System.out.println("1. Show all tasks");
        System.out.println("2. Create new task");
        System.out.println("3. Finish work");
        Scanner in = new Scanner(System.in);
        System.out.println("Choose menu item by entering item number:");
        return in.nextInt();
    }
}
