package Task05;

public class Main {

    public static void main(String[] args) {

        // SINGLETON
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println("University: " + config.getUniversityName());

        // FACTORY
        Student s1 = (Student) PersonFactory.createPerson(
                "student", "Alice", "Meyer");

        // OBSERVER
        StudentRegistry registry = new StudentRegistry();
        registry.addObserver(new StudentLogger());
        registry.addStudent(s1);

        // STRATEGY
        GradeContext grading = new GradeContext();

        grading.setStrategy(new GermanGrading());
        System.out.println("German Grade: " + grading.calculate(85));

        grading.setStrategy(new PassFailGrading());
        System.out.println("Pass/Fail: " + grading.calculate(85));
    }
}
