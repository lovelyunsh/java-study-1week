import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("1.원의넓이 2.사칙연산");
            int select = sc.nextInt();
            if (select == 1) {
                System.out.print("반지름을 입력하세요: ");
                int radius = sc.nextInt();
                double circleArea = calculator.calculateCircleArea(radius);
                List<Double> circleResultList = calculator.getCircleResultList();
                circleResultList.add(circleArea);
                calculator.setCircleResultList(circleResultList);
                calculator.inquiryCircleResults();
                sc.nextLine();
            } else if (select == 2) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                sc.nextLine();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.nextLine().charAt(0);
                int result = calculator.calculate(num1, num2, operator);
                List<Integer> resultList = calculator.getResultList();
                System.out.println("결과: " + result);
                resultList.add(result);
                calculator.setResultList(resultList);
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (sc.nextLine().equals("remove"))
                    calculator.removeResult();
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.nextLine().equals("inquiry")) {
                    calculator.inquiryResults();
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit"))
                break;
        }
    }
}
