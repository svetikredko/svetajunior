package by.statsenko.tasks;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Task> getMondayTasksList() {
        List<Task> monday = new ArrayList<>();
        Task goShop = new Task("Go shop");
        Task sleepDay = new Task("Sleep day");
        Task studyBook = new Task("Study book");

        monday.add(goShop);
        monday.add(sleepDay);
        monday.add(studyBook);

        return monday;
    }
}
