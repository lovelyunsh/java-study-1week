import java.util.List;

public class CircleCalculator extends Calculator {
    private final static double PI = 3.141592;

    public CircleCalculator(List<Double> resultList) {
        super(resultList);
    }

    public double calculate(double radius) {
        double circleResult = radius * radius * PI;
        super.getResultList().add(circleResult);
        return circleResult;
    }

}
