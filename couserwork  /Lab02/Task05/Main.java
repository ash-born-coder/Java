package Task5;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student(101, "Ash", 85.5),
                new Student(102, "Luffy", 91.0),
                new Student(103, "Ace", 78.5),
                new Student(104, "Ash", 85.5),  // duplicate
                new Student(105, "Daniel", 91.0)
        };

        // 1. Display original
        System.out.println("--- Original Students ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 2. Equality check
        System.out.println("\nEquality Check:");
        System.out.println(students[0].equals(students[3]));

        // 3. Sort by grade
        System.out.println("\nSorted by Grade:");
        bubbleSortByGrade(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 4. Sort by name
        System.out.println("\nSorted by Name:");
        bubbleSortByName(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 5. Find duplicates
        System.out.println("\nDuplicate Students:");
        findDuplicates(students);

        // 6. Search by ID
        System.out.println("\nSearch By ID (103):");
        Student s1 = searchByID(students, 103);
        System.out.println(s1 != null ? s1 : "Not found");

        // 7. Search by Name
        System.out.println("\nSearch By Name ('Bob'):");
        Student s2 = searchByName(students, "Bob");
        System.out.println(s2 != null ? s2 : "Not found");
    }

    public static void bubbleSortByGrade(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j].getGrade() > arr[j + 1].getGrade()) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortByName(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static Student searchByID(Student[] arr, int id) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getStudentID() == id) {
                return arr[i];
            }
        }
        return null;
    }

    public static Student searchByName(Student[] arr, String name) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equalsIgnoreCase(name)) {
                return arr[i];
            }
        }
        return null;
    }

    public static void findDuplicates(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }


}
