package Task5;

public class Student {

    private int studentID;
    private String name;
    private double grade;

    public Student(int studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public double getGrade() { return grade; }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Student other = (Student) obj;

        return this.studentID == other.studentID &&
                this.name.equals(other.name) &&
                this.grade == other.grade;
    }

    @Override
    public String toString() {
        return "Student[ID: " + studentID +
                ", Name: " + name +
                ", Grade: " + grade + "]";
    }
}
