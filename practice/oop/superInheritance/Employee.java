package javaCourse.superInInheritance;

public class Employee extends Person{

    int salary;


    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println("The salary of " + this.first + " " + this.last + " is " + this.salary);
    }
}
