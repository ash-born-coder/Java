package Task06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataManager {

    // SAVE TO FILE
    public void saveToFile(List<Student> students, String filename)
            throws DataPersistenceException {

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {

            writer.println("Matriculation,FirstName,LastName,Age");

            for (Student s : students) {
                writer.println(s.toString());
            }

        } catch (IOException e) {
            throw new DataPersistenceException("Failed to save students", e);
        }
    }

    // LOAD FROM FILE
    public List<Student> loadFromFile(String filename)
            throws DataPersistenceException {

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            reader.readLine(); // skip header
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    students.add(parseStudent(line));
                } catch (IllegalArgumentException e) {
                    System.err.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            throw new DataPersistenceException("Failed to load students", e);
        }

        return students;
    }

    private Student parseStudent(String line) {
        String[] parts = line.split(",");

        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid format");
        }

        return new Student(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Integer.parseInt(parts[3])
        );
    }
}
