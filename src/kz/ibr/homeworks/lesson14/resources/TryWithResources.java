package kz.ibr.homeworks.lesson14.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static String readFirstLineFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e){
            System.out.println("Something happened! =( : " + e.getCause());
        }
        return path;
    }
}
