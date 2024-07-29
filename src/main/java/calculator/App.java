package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";

        ArrayList<int[]> intList = new ArrayList<>();

        for (; !input.equals("exit"); ) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장한다.
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장한다.
            int num2 = sc.nextInt();

            // 사칙 연산 기호를 적합한 타입으로 선언한 변수에 저장한다. (charAt(0))
            System.out.println("사칙 연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;
            // 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현한다.

            if (operator == '+') {
                result = num1 + num2;
                System.out.println(" 결과 : " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println(" 결과 : " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println(" 결과 : " + result);
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("분모에 0이 들어갈 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println(" 결과 : " + result);
                }
            } else if (operator == '%') {
                if (num2 == 0) {
                    System.out.println("분모에 0이 들어갈 수 없습니다.");
                } else {
                    result = num1 % num2;
                    System.out.println(" 결과 : " + result);
                }
            } else {
                System.out.println("다시 입력해주세요.");
                continue;
            }

            // 결과를 ArrayList에 저장
            intList.add(new int[]{num1, num2, operator, result});

            sc.nextLine(); // 버퍼 비우기

            // remove 입력시 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            input = sc.nextLine();
            if (input.equals("remove")) {
                if (!intList.isEmpty()) {
                    intList.remove(0);
                    System.out.println("가장 먼저 저장된 값이 삭제됨.");
                } else {
                    System.out.println("삭제할 값이 없습니다.");
                }
            }

            // inquiry 입력시 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            input = sc.nextLine();
            if (input.equals("inquiry")) {
                // for 문 = for ( 변수타입 변수명 : 배열 ) { 연산 }
                for (int[] res : intList) {
                    System.out.println(res[0] + " " + (char)res[2] + " " + res[1] + " = " + res[3]);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            input = sc.nextLine();
        }

        // 프로그램 종료 시 Scanner 닫기 // 챗지피티가 닫아라고함.
        sc.close();
    }
}
