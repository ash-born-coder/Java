package Task05;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
