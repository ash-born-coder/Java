package javaCourse.superInInheritance;

public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa) {

        /*this.first = first;
        this.last = last;
        *this doesn't work therefore we have to use the 'super' which means go to the parent class
        *"Don't look at the subclass's version, use the parent's version of this variable or method"*/

        super(first, last);
        this.gpa = gpa;

        // so finally the student should have all the attributes of the Person class as well as their methods

    }
        void showGPA(){
            System.out.println("The gpa of " + this.first + " " + this.last + " is " + this.gpa);

    }


}
