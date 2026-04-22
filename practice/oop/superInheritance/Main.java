package javaCourse.superInInheritance;

public class Main {
    public static void main(String[] args){
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes


        Person person = new Person("Harry", "Potter");
        Student student = new Student("Hermione", "Granger",3.5);
        Employee employee = new Employee("Ron", "Weasley",28000);


        person.showName();
        System.out.println(student.gpa);
        student.showGPA();

        employee.showSalary();
    }
}
