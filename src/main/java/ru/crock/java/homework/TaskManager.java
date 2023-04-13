package ru.crock.java.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы с задачами
 */
public class TaskManager {

    /**
     * Лист задач
     */
    private final List<Task> taskList = new ArrayList<>();
    /**
     * Файл для сохранения задач
     */
    private final File saveFile;

    /**
     * Создает объект TaskManager и файл для сохранения задач
     */
    public TaskManager() {
        String filePath = getClass().getClassLoader().getResource("").getPath() + "SaveFiles";
        new File(filePath).mkdir();
        saveFile = new File(filePath + "/saveTasks.dat");
        try {
            saveFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        loadTask();
    }


    /**
     * Метод для добавления задачи в список
     * @param tk - задача
     */
    public void addTask(Task tk){
        taskList.add(tk);
    }

    /**
     * Метод для удаления задачи из списка
     * @param name - наименование задачи
     */
    public void delTask(String name){
        taskList.removeIf(el -> el.getName().equals(name));
    }

    /**
     * Метод для редактирования задачи
     * @param tk - задача, которую нужно отредактировать
     * @param code - новый код задачи
     * @param name - новое наименование задачи
     * @param description - новое описание задачи
     * @param executor - новый исполнитель задачи
     * @param status - новый статус задачи
     */
    public void editTask(Task tk, String code, String name, String description, String executor, String status){
        for (var el : taskList) {
            if(el.equals(tk)){
                el.setCodeTask(code);
                el.setName(name);
                el.setDescription(description);
                el.setExecutor(executor);
                el.setStatus(status);
            }
        }
    }

    /**
     * Метод загрузки задач из файла
     */
    private void loadTask() {
        try (InputStream inputStream = new FileInputStream(saveFile);
             ObjectInputStream objectInput = new ObjectInputStream(inputStream)) {
            taskList.addAll((List<Task>) objectInput.readObject());
        } catch (EOFException ignored) {
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Метод сохранения задач в файл
     */
    public void saveTask() {
        try (OutputStream outputStream = new FileOutputStream(saveFile);
             ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream)) {
            objectOutput.writeObject(taskList);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Метод вывода списка задач
     * @return задачи
     */
    public String SWOT(){
        StringBuilder response = new StringBuilder();
        for (var el : taskList) {
            response.append(el.toString()).append("\n");
        }
        return response.toString();
    }
}

