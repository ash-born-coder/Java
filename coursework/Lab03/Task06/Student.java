package Task06;

public class Student {

    private int matriculationNumber;
    private String firstName;
    private String lastName;
    private int age;

    public Student(int matriculationNumber, String firstName, String lastName, int age) {
        this.matriculationNumber = matriculationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getMatriculationNumber() { return matriculationNumber; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return matriculationNumber + "," + firstName + "," + lastName + "," + age;
    }
}
