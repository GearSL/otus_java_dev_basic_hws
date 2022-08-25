package kz.ibr.homeworks.lesson14.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {

    public static void generateFileNotFound() {
        File textFile = new File("test");
        Scanner reader;
        try {
            reader = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            //Просто выбросить исключение со стек трейсом.
            //throw new RuntimeException(e);
            //Вывести сообщение об ошибке.
            System.out.println("File not found");
        }
    }
}
