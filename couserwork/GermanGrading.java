package Task04;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    // List keeps insertion order
    private List<Student> students = new ArrayList<>();

    // ---------------- ADD ----------------
    public void addStudent(Student student) {
        students.add(student);
    }

    // ---------------- BUBBLE SORT ----------------

    // Sort by name (alphabetical)
    public void sortByName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getName()
                        .compareTo(students.get(j + 1).getName()) > 0) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    // Sort by matriculation number
    public void sortByMatriculationNumber() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getMatriculationNumber() >
                        students.get(j + 1).getMatriculationNumber()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    // Sort by age
    public void sortByAge() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getAge() >
                        students.get(j + 1).getAge()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    // ---------------- SEARCH ----------------

    // Partial name match
    public void findByPartialName(String part) {
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    // Matriculation number range
    public void findByMatriculationRange(int min, int max) {
        for (Student s : students) {
            if (s.getMatriculationNumber() >= min &&
                    s.getMatriculationNumber() <= max) {
                System.out.println(s);
            }
        }
    }

    // Older than specific age
    public void findOlderThan(int age) {
        for (Student s : students) {
            if (s.getAge() > age) {
                System.out.println(s);
            }
        }
    }

    public void displayAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
