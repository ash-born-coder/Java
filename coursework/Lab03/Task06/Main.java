package Task06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        StudentDataManager manager = new StudentDataManager();

        try {
            InputValidator.validateMatriculationNumber(1234);
            InputValidator.validateName("Alice");

            students.add(new Student(1234, "Alice", "Meyer", 22));
            students.add(new Student(2345, "Bob", "Schmidt", 24));

            AppLogger.LOGGER.info("Saving students...");
            manager.saveToFile(students, "students.csv");

            AppLogger.LOGGER.info("Loading students...");
            List<Student> loaded = manager.loadFromFile("students.csv");

            for (Student s : loaded) {
                System.out.println(s);
            }

        } catch (StudentManagementException e) {
            AppLogger.LOGGER.severe(e.getMessage());
        }
    }
}
