package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FileIO {

    public static String[] loadData(String path, int linesToSkip) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()) {
                for (int i = 0; i < linesToSkip; i++)
                    scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.format("Error: File '%s' does not exist.\n", path);
        }

        return data.toArray(String[]::new);
    }

    public static String[] loadData(String path) {
        return loadData(path, 0);
    }

    public static boolean saveData(String path, Object... data) {
        try (FileWriter writer = new FileWriter(path)) {

            for (Object objectData : data) {
                writer.write(objectData.toString());
            }

            return true;
        } catch (IOException e) {
            System.out.println("Error: Could not write to file: " + e.getMessage());
            return false;
        }
    }

    public static <E> boolean saveData(String path, Collection<E> data) {
        try (FileWriter writer = new FileWriter(path)) {

            for (E objectData : data) {
                writer.write(objectData.toString());
            }

            return true;
        } catch (IOException e) {
            System.out.println("Error: Could not write to file: " + e.getMessage());
            return false;
        }
    }
}
