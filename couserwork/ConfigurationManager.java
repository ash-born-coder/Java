package Task04;

public class Student {

    private String name;
    private int matriculationNumber;
    private int age;

    public Student(String name, int matriculationNumber, int age) {
        this.name = name;
        this.matriculationNumber = matriculationNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " | MatNo: " + matriculationNumber + " | Age: " + age;
    }
}
