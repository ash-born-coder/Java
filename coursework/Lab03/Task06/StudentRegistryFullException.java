package Task06;

public class StudentRegistryFullException extends StudentManagementException {
    public StudentRegistryFullException(int maxCapacity) {
        super("Student registry is full. Max capacity: " + maxCapacity);
    }
}
