package kz.ibr.homeworks.lesson14;

import kz.ibr.homeworks.lesson14.resources.File;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {

        String filePath = "./src/kz/ibr/homeworks/lesson14/resources/test.txt";
        File.createFile(filePath);

        File.fillFile(filePath, "First sentence in file");
        File.fillFile(filePath, "Second sentence in file");

        System.out.println("*** File content: ***");
        File.readFile(filePath);
    }
}
