package kz.ibr.homeworks.lesson14.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void readFile(String filePath) {
        //Вариант с ручным закрытием ресурса
        try {
            File fileObj = new File(filePath);
            Scanner scanner = new Scanner(fileObj);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
