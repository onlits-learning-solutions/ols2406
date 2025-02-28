package ols2406.todoapp;

public class TaskList {

    private int id;
    private String name;
    private Task[] tasks;

    private static TaskList taskList = null;

    private TaskList() {
        id = 0;
        name = "default";
        tasks = null;
    }

    public static TaskList getTaskList() {      //Singleton pattern
        if (taskList == null) {
            taskList = new TaskList();
        }

        return taskList;
    }

    void display() {
        System.out.println("Task List");
    }
}
