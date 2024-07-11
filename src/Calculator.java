import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Calculator {
    //파이는 변하지 않고 모든 인스턴스가 공유해서 쓸 수 있기 때문에 final static으로 선언.
    private final static double PI = 3.141592;
    private int result;
    private List<Integer> resultList;
    private List<Double> circleResultList;

    public Calculator() {
        resultList = new ArrayList<>();
        circleResultList = new ArrayList<>();
    }

    public double calculateCircleArea(int radius) {
        double circleResult = radius * radius * PI;
        return circleResult;
    }

    public List<Integer> getResultList() {
        return new ArrayList<>(resultList);
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public List<Double> getCircleResultList() {
        return new ArrayList<>(circleResultList);
    }

    public void setCircleResultList(List<Double> circleResultList) {
        this.circleResultList = circleResultList;
    }

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

    public void removeResult() {
        resultList.remove(0);
    }

    public void inquiryResults() {
        System.out.println(Arrays.toString(resultList.toArray()));
    }

    public void inquiryCircleResults() {
        System.out.println(Arrays.toString(circleResultList.toArray()));
    }
}
