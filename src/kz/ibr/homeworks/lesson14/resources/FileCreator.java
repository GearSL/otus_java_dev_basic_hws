package kz.ibr.homeworks.lesson14.resources;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void createFile(String name) throws IOException {
        //Rethrow exception
        try {
            File myObj = new File(name);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            throw new IOException(e);
        }
    }
}
