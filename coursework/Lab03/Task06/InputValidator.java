package Task06;

public class InputValidator {

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void validateMatriculationNumber(int number)
            throws InvalidMatriculationNumberException {

        if (number < 1000 || number > 999999) {
            throw new InvalidMatriculationNumberException(
                    "Matriculation number must be between 1000 and 999999");
        }
    }
}
