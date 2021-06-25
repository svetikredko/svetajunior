package by.statsenko.tasks;

import java.util.Scanner;

public class Task {
    private String name;
    private boolean done;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Name of the task: " + name + ", is done: " + done;
    }

  }
