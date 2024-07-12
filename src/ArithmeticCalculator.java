import java.util.Arrays;
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
        OperatorType operatorType = OperatorType.getOperatorType(operator);
        return switch (operatorType) {
            case ADD -> new AddOperator();
            case SUBTRACT -> new SubtractOperator();
            case MULTIPLY -> new MultiplyOperator();
            case DIVIDE -> new DivideOperator();
            case MOD -> new ModOperator();
        };
    }

}
