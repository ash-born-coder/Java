package Task04;

public class Main {

    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();

        registry.addStudent(new Student("Charlie", 1003, 21));
        registry.addStudent(new Student("Alice", 1001, 22));
        registry.addStudent(new Student("David", 1004, 24));
        registry.addStudent(new Student("Bob", 1002, 23));

        System.out.println("=== Original Order ===");
        registry.displayAll();

        System.out.println("\n=== Sorted by Name (Bubble Sort) ===");
        registry.sortByName();
        registry.displayAll();

        System.out.println("\n=== Sorted by Matriculation Number (Bubble Sort) ===");
        registry.sortByMatriculationNumber();
        registry.displayAll();

        System.out.println("\n=== Students with name containing 'a' ===");
        registry.findByPartialName("a");

        System.out.println("\n=== Students with Matriculation Number between 1002 and 1004 ===");
        registry.findByMatriculationRange(1002, 1004);

        System.out.println("\n=== Students older than 22 ===");
        registry.findOlderThan(22);
    }
}
