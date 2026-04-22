package Task05;

public class StudentLogger implements StudentObserver {

    @Override
    public void onStudentAdded(Student student) {
        System.out.println("LOG: Student added -> " + student.getName());
    }
}
