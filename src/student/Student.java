package student;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String[] studentList) {
        setFirstName(studentList[0]);
        setLastName(studentList[1]);
        setYear(studentList[2]);
        setGender(studentList[3]);
        setMark(studentList[4]);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.charAt(0);
    }

    public double getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = Double.parseDouble(mark);
    }
}
