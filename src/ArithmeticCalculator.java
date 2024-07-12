import java.util.List;

public class ArithmeticCalculator extends Calculator {
    private Operator operator;

    public ArithmeticCalculator(List<Double> resultList) {
        super(resultList);
    }

    public double calculate(double num1, double num2, char operator) {
        this.operator = getOperator(operator);
        double result = this.operator.operate(num1, num2);
        super.getResultList().add(result);
        return result;
    }

    private Operator getOperator(char operator) {
        return switch (operator) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new IllegalArgumentException("올바르지 않은 연산자");
        };
    }

}
