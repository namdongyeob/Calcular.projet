package example.calculator;


import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> results = new ArrayList<>();
    //게터
     public ArrayList<Integer> getResults() {
        return this.results;
    }
    //세터
    public void setResults(ArrayList<Integer>results) {
         this.results = results;
    }

    // 2. 사칙연산
    public int calculate(int num1, int num2, String giho) {
        int result = 0;

        try {
            if (giho.equals("+")) {
                result = num1 + num2;
            } else if (giho.equals("-")) {
                result = num1 - num2;
            } else if (giho.equals("*")) {
                result = num1 * num2;
            } else if (giho.equals("/")) {
                result = num1 / num2;
            }
            results.add(result);
            }
        catch (ArithmeticException error) {
            System.out.println("0으로 나눌수 없습니다.");
        }
        return result;


    }
}