package ru.crock.java.homework;


import java.io.Serializable;
import java.util.Objects;

/**
 * Класс задач
 */
public class Task implements Serializable {

    /**
     * Код задачи
     */
    private String codeTask;
    /**
     * Наименование задачи
     */
    private String name;
    /**
     * Описание задачи
     */
    private String description;
    /**
     * Исполнитель задачи
     */
    private String executor;
    /**
     * Статус задачи
     */
    private String status;

    /**
     * Создание задач
     * @param codeTask - код задачи
     * @param name - наименование задачи
     * @param description - описание задачи
     * @param executor - исполнитель задачи
     * @param status - статус задачи
     */
    public Task(String codeTask, String name, String description, String executor, String status) {
        this.codeTask = codeTask;
        this.name = name;
        this.description = description;
        this.executor = executor;
        this.status = status;
    }

    /**
     * Установка значения наименования задачи
     * @param name - наименование
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Установка значения описания задачи
     * @param description - описание
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Установка исполнителя задачи
     * @param executor - исполнитель
     */
    public void setExecutor(String executor) {
        this.executor = executor;
    }

    /**
     * Установка статуса задачи
     * @param status - статус
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Установка кода задачи
     * @param codeTask - код
     */
    public void setCodeTask(String codeTask) {
        this.codeTask = codeTask;
    }

    /**
     * Возврат наименование задачи
     * @return - наименование задачи
     */
    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(codeTask, task.codeTask) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(executor, task.executor) && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeTask, name, description, executor, status);
    }

    @Override
    public String toString() {
        return "Task" +
                " codeTask = " + codeTask +
                ", name = " + name+
                ", description = " + description +
                ", executor = " + executor +
                ", status = " + status;
    }
}
