package kz.ibr.homeworks.lesson14.resources;

import java.io.IOException;

public class File {
    public static void createFile(String name) throws IOException {
        FileCreator.createFile(name);
    }
    public static void fillFile(String filePath, String text){
        FileFiller.fillFile(filePath, text);
    }
    public static void readFile(String filePath){
        FileReader.readFile(filePath);
    }
}
