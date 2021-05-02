package main;

import service.FileService;
import service.StudentService;
import student.Student;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] read = new String[0];
        try {
            read = FileService.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Student student1 = new Student(read[0].split(","));
        Student student2 = new Student(read[1].split(","));
        Student student3 = new Student(read[2].split(","));

        StudentService.printFullNames(student1, student2, student3);

        Student[] students = {student1, student2, student3};
        StudentService.printAllMale(students);

        StudentService.femaleGreaterMark(students);

        StudentService.minimalMark(students);

        StudentService.printBiggestMaleInfo(students);


        StudentService.printStudentsSortedByMark(students);

        StudentService.printFemaleStudentsSortedByYear(students);


    }
}
