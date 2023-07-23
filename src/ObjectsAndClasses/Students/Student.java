package ObjectsAndClasses.Students;

public class Student {

    private String firstName;

    private String lastName;

    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public int compareTo(Student other){
        return Double.compare(other.grade, this.grade);
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ": " + this.grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }
}
