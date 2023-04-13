package ru.crock.java.homework;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while(true){
            System.out.print("\n" + "--------MENU--------" + "\n" + "1 - Добавление задачи" + "\n"
                    + "2 - Удаление задачи" + "\n"
                    + "3 - Редактирование задачи" + "\n"
                    + "4 - Сохранение задач в файл" + "\n"
                    + "5 - Вывод списка задач" + "\n");
            int count = Integer.parseInt(input.nextLine());
            switch (count) {
                case 1 -> {
                    System.out.print("\nВведите код задачи: ");
                    String codeTask = input.nextLine();
                    System.out.print("\nВведите наименование задачи: ");
                    String name = input.nextLine();
                    System.out.print("\nВведите описание задачи: ");
                    String description = input.nextLine();
                    System.out.print("\nВведите исполнителя задачи: ");
                    String executor = input.nextLine();
                    System.out.print("\nВведите статус задачи: ");
                    String status = input.nextLine();
                    taskManager.addTask(new Task(codeTask, name, description, executor, status));
                }
                case 2 -> {
                    System.out.println("\nВведите имя задачи которую нужно удалить: ");
                    String nameDel = input.nextLine();
                    taskManager.delTask(nameDel);
                }
                case 3 -> {
                    System.out.print("\nВведите код задачи, которую нужно отредактировать: ");
                    String codeTask = input.nextLine();
                    System.out.print("\nВведите имя задачи, которую нужно отредактировать: ");
                    String name = input.nextLine();
                    System.out.print("\nВведите описание задачи, которую нужно отредактировать: ");
                    String description = input.nextLine();
                    System.out.print("\nВведите исполнителя задачи, которую нужно отредактировать: ");
                    String executor = input.nextLine();
                    System.out.print("\nВведите статус задачи, которую нужно отредактировать: ");
                    String status = input.nextLine();
                    System.out.print("\nВведите новый код для задачи: ");
                    String codeTaskEdit = input.nextLine();
                    System.out.print("\nВведите новое имя для задачи: ");
                    String nameEdit = input.nextLine();
                    System.out.print("\nВведите новое описание для задачи: ");
                    String descriptionEdit = input.nextLine();
                    System.out.print("\nВведите нового исполнителя для задачи: ");
                    String executorEdit = input.nextLine();
                    System.out.print("\nВведите новый статус для задачи: ");
                    String statusEdit = input.nextLine();
                    taskManager.editTask(new Task(codeTask, name, description, executor, status), codeTaskEdit, nameEdit,
                            descriptionEdit, executorEdit, statusEdit);
                }
                case 4 -> {
                    taskManager.saveTask();
                    System.out.println("\nЗадачи сохранены!");

                }
                case 5 -> {
                    System.out.println("\nВсе задачи:");
                    System.out.println(taskManager.SWOT());
                }
                default -> {
                }
            }
        }


    }
}