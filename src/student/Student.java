package student;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double weight;


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

    public double getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = Double.parseDouble(weight);
    }
}
