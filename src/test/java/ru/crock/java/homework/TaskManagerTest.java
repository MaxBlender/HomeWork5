package ru.crock.java.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс теста TaskManager
 */
public class TaskManagerTest {

    /**
     * Проверка добавления задачи
     */
    @Test
    public void testAddTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("1", "1", "1", "1", "1"));
        String response = taskManager.SWOT();
        assertEquals("Task" +
                " codeTask = " + "1" +
                ", name = " + "1"+
                ", description = " + "1" +
                ", executor = " + "1" +
                ", status = " + "1" + "\n", response);
    }

    /**
     * Проверка удаления задачи
     */
    @Test
    public void testRemoveTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("1", "1", "1", "1", "1"));
        taskManager.delTask("1");
        String response = taskManager.SWOT();
        assertEquals("", response);
    }

    /**
     * Проверка редактирования задачи
     */
    @Test
    public void testEditTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("1", "1", "1", "1", "1"));
        taskManager.editTask(new Task("1", "1", "1", "1", "1"), "2", "2", "2", "2", "2");
        String response = taskManager.SWOT();
        assertEquals("Task" +
                " codeTask = " + "2" +
                ", name = " + "2"+
                ", description = " + "2" +
                ", executor = " + "2" +
                ", status = " + "2" + "\n", response);
    }

    /**
     * Проверка вывода задач
     */
    @Test
    public void testSWOTTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("1", "1", "1", "1", "1"));
        taskManager.addTask(new Task("2", "2", "2", "2", "2"));
        taskManager.addTask(new Task("3", "3", "3", "3", "3"));
        String response = taskManager.SWOT();
        assertEquals("Task" +
                " codeTask = " + "1" +
                ", name = " + "1"+
                ", description = " + "1" +
                ", executor = " + "1" +
                ", status = " + "1" + "\n" + "Task" +
                " codeTask = " + "2" +
                ", name = " + "2"+
                ", description = " + "2" +
                ", executor = " + "2" +
                ", status = " + "2" + "\n" + "Task" +
                " codeTask = " + "3" +
                ", name = " + "3"+
                ", description = " + "3" +
                ", executor = " + "3" +
                ", status = " + "3" + "\n", response);
    }

}
