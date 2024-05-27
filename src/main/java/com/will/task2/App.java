package com.will.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    private static final long FILE_SIZE_THRESHOLD = 10 * 1024 * 1024;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryPath;

        do {
            System.out.print("Enter the directory path: ");
            directoryPath = scanner.nextLine();
        } while (!isValidDirectory(directoryPath));

        System.out.println("Searching for files larger than 10 MB in " + directoryPath + "...");
        findLargeFiles(Paths.get(directoryPath));
    }

    private static boolean isValidDirectory(String path) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            return true;
        } else {
            System.out.println("Invalid directory path. Please try again.");
            return false;
        }
    }

    private static void findLargeFiles(Path directory) {
        try (Stream<Path> paths = Files.walk(directory)) {
            paths.filter(Files::isRegularFile)
                    .filter(path -> {
                        try {
                            return Files.size(path) > FILE_SIZE_THRESHOLD;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
