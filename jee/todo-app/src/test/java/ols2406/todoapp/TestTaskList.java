package ols2406.todoapp;

import com.sun.source.util.TaskListener;

public class TestTaskList {
    public static void main(String[] args) {
        TaskList taskList = TaskList.getTaskList();
        TaskList taskList1 = TaskList.getTaskList();
        System.out.println(taskList);
        System.out.println(taskList1);
        taskList.display();
    }
}