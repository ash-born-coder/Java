package Task05;

public class GradeContext {

    private GradingStrategy strategy;

    public void setStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public String calculate(int points) {
        return strategy.calculateGrade(points);
    }
}
