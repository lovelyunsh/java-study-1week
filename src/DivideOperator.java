public class DivideOperator implements Operator {
    @Override
    public double operate(double num1, double num2) {
        if(num2 == 0) throw new IllegalArgumentException("분모는 0이 될 수 없음.");
        return num1 / num2;
    }
}
