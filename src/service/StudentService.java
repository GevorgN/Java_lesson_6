package service;

import student.Student;


public class StudentService {

    public static Student createStudent(String[] studentList) {
        Student student = new Student();
        student.setFirstName(studentList[0]);
        student.setLastName(studentList[1]);
        student.setYear(studentList[2]);
        student.setGender(studentList[3]);
        student.setWeight(studentList[4]);
        return student;
    }

    private static void printInfo(Student student) {
        System.out.println("\nStudent first name is " + student.getFirstName() + " last name is " + student.getLastName());
        System.out.printf("%s was born in %d\n", student.getFirstName(), student.getYear());
        System.out.printf("%s is a %s\n", student.getFirstName(), student.getGender() == 'm' ? "male" : "female");
        System.out.printf("%s weight is %s\n", student.getFirstName(), student.getWeight());
    }

    public static void createStudentFromList(String[] read) {
        String[] studentList1 = read[0].split(",");
        Student student1 = StudentService.createStudent(studentList1);
        String[] studentList2 = read[1].split(",");
        Student student2 = StudentService.createStudent(studentList2);
        String[] studentList3 = read[2].split(",");
        Student student3 = StudentService.createStudent(studentList3);
        String[] studentList4 = read[3].split(",");
        Student student4 = StudentService.createStudent(studentList4);
        String[] studentList5 = read[4].split(",");
        Student student5 = StudentService.createStudent(studentList5);
        String[] studentList6 = read[5].split(",");
        Student student6 = StudentService.createStudent(studentList6);
        StudentService.printInfo(student1);
        StudentService.printInfo(student2);
        StudentService.printInfo(student3);
        StudentService.printInfo(student4);
        StudentService.printInfo(student5);
        StudentService.printInfo(student6);
    }
}
