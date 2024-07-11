import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resultArray[] = new int[10];
        int idx = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);
            int result = 0;
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
                    if (num2 == 0) {
                        System.out.println("분모는 0이 될 수 없음.");
                        break;
                    }
                    result = num1 / num2;
                    break;
            }
            if(idx == 10){
                for(int i = 0 ; i < 9 ; i++){
                    resultArray[i] = resultArray[i+1];
                }
                idx--;
            }
            resultArray[idx++] = result;

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit"))
                break;
        }
    }
}
