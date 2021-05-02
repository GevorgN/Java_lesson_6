package service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {
    public static String[] read() throws IOException {
        String path = "E:\\Dev\\java_lesson_6\\Java_lesson_6\\Java_lesson_6\\src\\main\\students.txt";
        return Files.readAllLines(Paths.get(path)).toArray(new String[0]);
    }

}
