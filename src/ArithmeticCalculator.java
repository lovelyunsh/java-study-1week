import java.util.List;

public class ArithmeticCalculator extends Calculator {
    private Operator operator;

    public ArithmeticCalculator(List<Double> resultList) {
        super(resultList);
    }

    public double calculate(double num1, double num2, char operator) {
        changeOperator(operator);
        double result = this.operator.operate(num1, num2);
        super.getResultList().add(result);
        return result;
    }

    private void changeOperator(char operator) {
        switch (operator) {
            case '+':
                this.operator = new AddOperator();
                return;
            case '-':
                this.operator = new SubtractOperator();
                return;
            case '*':
                this.operator = new MultiplyOperator();
                return;
            case '/':
                this.operator = new DivideOperator();
                return;
            default:
                throw new IllegalArgumentException("올바르지 않은 연산자");
        }
    }

}
