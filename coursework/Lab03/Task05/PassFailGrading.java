package Task05;

public class PassFailGrading implements GradingStrategy {

    @Override
    public String calculateGrade(int points) {
        return points >= 60 ? "PASS" : "FAIL";
    }
}
