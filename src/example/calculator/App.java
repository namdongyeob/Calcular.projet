package example.calculator;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();


        while (true) {

            System.out.println("첫번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            String giho = sc.next();

            System.out.println("두번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("입력된 식: " + num1 + " " + giho + " " + num2);

            int result = calculator.calculate(num1, num2, giho);
            System.out.println("결과" +  result);

            ArrayList<Integer> newResult = calculator.getResults();
            System.out.println("현재까지 기록" + newResult);




            System.out.println("exit 입력시 종료됩니다. ");
            String answer = sc.next();


            if (answer.equals("exit")) {
                System.out.println("계산기 종료");
                break;



            }
        }
        System.out.println("초기화 하시겠습니까? ");
        String input = sc.next();
        if (input.equals("초기화")) {
            ArrayList<Integer> newList = new ArrayList<>();
            calculator.setResults(newList);
            System.out.println("초기화");
            System.out.println("현재 기록 상황" + calculator.getResults());
        }


    }
}
