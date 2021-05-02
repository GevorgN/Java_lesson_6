package service;

import student.Student;


public class StudentService {


    private static void printInfo(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.printf("%s was born in %d\n", student.getFirstName(), student.getYear());
        System.out.printf("%s is a %s\n", student.getFirstName(), student.getGender() == 'm' ? "male" : "female");
        System.out.printf("%s mark is %s\n", student.getFirstName(), student.getMark());
        System.out.println();
    }


    public static void printFullNames(Student student1) {
        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        System.out.println();
    }

    public static void printFullNamesWithMarks(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getMark());
        System.out.println();
    }

    public static void printFullNamesWithYears(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getYear());
        System.out.println();
    }

    public static void printFullNames(Student student1, Student student2) {
        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        System.out.println(student2.getFirstName() + " " + student2.getLastName());
        System.out.println();
    }

    public static void printFullNames(Student student1, Student student2, Student student3) {
        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        System.out.println(student2.getFirstName() + " " + student2.getLastName());
        System.out.println(student3.getFirstName() + " " + student3.getLastName());
        System.out.println();
    }

    public static void printAllMale(Student[] students) {
        for (Student x : students) {
            if (x.getGender() == 'm') {
                StudentService.printFullNames(x);
            }
        }
    }

    public static void femaleGreaterMark(Student[] students) {
        for (Student x : students) {
            if (x.getGender() == 'f' && x.getMark() > 50.4) {
                StudentService.printFullNames(x);
            }
        }
    }

    public static void minimalMark(Student[] students) {
        Student minimal = students[0].getMark() < students[1].getMark() ? students[0] : students[1];
        if (minimal.getMark() > students[2].getMark()) {
            minimal = students[2];
        }
        printInfo(minimal);
    }

    public static void printBiggestMaleInfo(Student[] students) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i].getYear() > students[i + 1].getYear()) {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                    flag = true;
                }
            }
            count++;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'm') {
                printInfo(students[0]);
            }
        }
    }


    public static void printStudentsSortedByMark(Student[] students) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                    flag = true;
                }
            }
            count++;
        }
        for (int i = 0; i < students.length; i++) {
            printFullNamesWithMarks(students[i]);
        }
    }

    public static void printFemaleStudentsSortedByYear(Student[] students) {
        for (Student x : students) {
            if (x.getGender() == 'f') {
                int count = 0;
                boolean flag = true;
                while (flag) {
                    flag = false;
                    for (int i = 0; i < students.length - 1 - count; i++) {
                        if (students[i].getYear() > students[i + 1].getYear()) {
                            Student tmp = students[i];
                            students[i] = students[i + 1];
                            students[i + 1] = tmp;
                            flag = true;
                        }
                    }
                    count++;
                }
                for (int i = 0; i < students.length; i++) {
                    printFullNamesWithYears(students[i]);
                }
            }
        }
    }
}
