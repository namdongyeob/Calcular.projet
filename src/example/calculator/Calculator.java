package example.calculator;


import java.util.ArrayList;

public class Calculator {
    // 1. 결과 저장 바구니
    ArrayList<Integer> results = new ArrayList<>();
    //게터
     public ArrayList<Integer> getResults() {
        return this.results;
    }
    //세터
    public void setResults(ArrayList<Integer>results) {
         this.results = results;
    }

    // 2. 사칙연산 수행 메서드
    public int calculate(int num1, int num2, String giho) { // 메서드 시작 {
        int result = 0;

        if (giho.equals("+")) {
            result = num1 + num2;
        } else if (giho.equals("-")) {
            result = num1 - num2;
        } else if (giho.equals("*")) {
            result = num1 * num2;
        } else if (giho.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
        results.add(result);
        return result;

    }

    public ArrayList<Integer> getresults() {
        return results;
    }
}