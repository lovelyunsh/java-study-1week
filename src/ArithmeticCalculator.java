import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> resultList) {
        super(resultList);
    }

    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0)
                    throw new IllegalArgumentException("분모는 0이 될 수 없음.");
                result = num1 / num2;
                break;
        }
        super.getResultList().add(result);
        return result;
    }

}
