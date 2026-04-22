package Task05;

public class GermanGrading implements GradingStrategy {

    @Override
    public String calculateGrade(int points) {
        if (points >= 90) return "1.0";
        if (points >= 80) return "2.0";
        if (points >= 70) return "3.0";
        if (points >= 60) return "4.0";
        return "5.0";
    }
}
