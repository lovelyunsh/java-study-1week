public class Calculator {
    private int result;
    public int calculate(int num1, int num2, char operator) {
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
        return result;
    }
}
