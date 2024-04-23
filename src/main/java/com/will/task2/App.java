package com.will.task2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String directoryPath = getValidInput();

        printLargeFiles(directoryPath);
    }

    private static String getValidInput() {
        Scanner scanner = new Scanner(System.in);
        String directoryPath;

        do {
            System.out.println("Введите путь к папке:");
            directoryPath = scanner.nextLine();
        } while (!isValidDirectory(directoryPath));

        return directoryPath;
    }

    private static void printLargeFiles(String directoryPath) {
        Path directory = Paths.get(directoryPath);

        try {
            Files.walk(directory)
                    .filter(Files::isRegularFile)
                    .filter(path -> {
                        try {
                            return Files.size(path) > 10 * 1024 * 1024;
                        } catch (Exception e) {
                            return false;
                        }
                    })
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Ошибка при поиске файлов: " + e.getMessage());
        }
    }

    private static boolean isValidDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.exists() && directory.isDirectory();
    }
}
