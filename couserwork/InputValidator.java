package Task05;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    private List<Student> students = new ArrayList<>();
    private List<StudentObserver> observers = new ArrayList<>();

    public void addObserver(StudentObserver observer) {
        observers.add(observer);
    }

    public void addStudent(Student student) {
        students.add(student);
        notifyObservers(student);
    }

    private void notifyObservers(Student student) {
        for (StudentObserver o : observers) {
            o.onStudentAdded(student);
        }
    }
}
