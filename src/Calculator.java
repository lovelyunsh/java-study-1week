import java.util.Arrays;
import java.util.List;

public class Calculator {

    private List<Double> resultList;

    public Calculator(List<Double> resultList) {
        this.resultList = resultList;
    }


    public List<Double> getResultList() {
        return resultList;
    }

    public void removeResult() {
        if (!resultList.isEmpty()) resultList.remove(0);
    }

    public void inquiryResults() {
        System.out.println(Arrays.toString(resultList.toArray()));
    }

}
