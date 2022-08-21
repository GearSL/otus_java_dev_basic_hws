package kz.ibr.homeworks.lesson14.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RethrowException {
    public static void generateAndRethrow() throws IOException {
        File textFile = new File("test");
        Scanner reader;

        {
            try {
                reader = new Scanner(textFile);
            } catch (FileNotFoundException e) {
                throw new IOException(e);
            }
        }
    }
}
