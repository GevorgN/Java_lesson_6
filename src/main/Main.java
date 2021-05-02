package main;

import service.FileService;
import service.StudentService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] read = new String[0];
        try {
            read = FileService.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StudentService.createStudentFromList(read);
    }
}
