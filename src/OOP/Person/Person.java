package OOP.Person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){

        if (!(this.getAge() < 20 && this.getAge() > 12)){
            return false;
        }

        return true;
    }

    public String getFullName(){

        String firstName = this.getFirstName();
        String lastName = this.getLastName();

        if (lastName.isEmpty() && firstName.isEmpty()) {
            return " ";
        } else if (lastName.isEmpty()) {
            return  firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        }

        return firstName + " " + lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
