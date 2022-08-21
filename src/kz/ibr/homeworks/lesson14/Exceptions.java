package kz.ibr.homeworks.lesson14;

import kz.ibr.homeworks.lesson14.resources.FileException;
import kz.ibr.homeworks.lesson14.resources.TryWithResources;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        FileException.generateFileNotFound();
        //RethrowException.generateAndRethrow();
        TryWithResources.readFirstLineFromFile("test");
    }
}
