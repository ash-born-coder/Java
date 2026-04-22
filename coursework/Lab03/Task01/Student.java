package Task01;

public class Student extends Person {

    private int matriculationNumber;
    private static int nextMatriculationNumber = 1001;

    public Student(String firstName, String lastName, int day, int month, int year) {

        super(firstName, lastName, day, month, year);
        this.matriculationNumber = nextMatriculationNumber++;

    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Matriculation number: " + matriculationNumber);
    }
}

