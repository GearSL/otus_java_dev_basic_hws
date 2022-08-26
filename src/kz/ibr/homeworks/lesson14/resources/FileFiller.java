package kz.ibr.homeworks.lesson14.resources;

import java.io.FileWriter;
import java.io.IOException;

public class FileFiller {
    public static void fillFile (String filePath, String text){
        //Вариант с автоматическим закрытием ресурса
        try(FileWriter writer = new FileWriter(filePath, true)){
            writer.write(text + "\r\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
