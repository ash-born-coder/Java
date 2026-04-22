package Task05;

public class PersonFactory {

    public static Person createPerson(String type, String firstName, String lastName) {

        switch (type.toLowerCase()) {
            case "student":
                return new Student(firstName, lastName);
            case "professor":
                return new Professor(firstName, lastName);
            case "staff":
                return new Staff(firstName, lastName);
            default:
                throw new IllegalArgumentException("Unknown person type");
        }
    }
}
