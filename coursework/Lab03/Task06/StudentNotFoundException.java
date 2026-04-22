package Task06;

public class StudentNotFoundException extends StudentManagementException {
    public StudentNotFoundException(int matriculationNumber) {
        super("Student with matriculation number " + matriculationNumber + " not found");
    }
}
