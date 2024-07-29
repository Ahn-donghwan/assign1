package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App { public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int[] results = new int[10];
//        int count = 0;

        ArrayList<Integer> results = new ArrayList<>();


            while (true) {  // true 를 쓰면 while 문을 조건없이 무한 반복한다는 의미
                System.out.println("첫 번째 숫자를 입력하세요: ");
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장한다.
                int num1 = sc.nextInt();
                System.out.println("두 번째 숫자를 입력하세요: ");
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장한다.
                int num2 = sc.nextInt();

                // 사칙 연산 기호를 적합한 타입으로 선언한 변수에 저장한다. (charAt(0))
                System.out.println("사칙 연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                sc.nextLine();

                int result = 0;
                // 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현한다.

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
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    default :
                        System.out.println("연산이 불가능합니다.");
                }
                System.out.println(result);
//                if (count == 10) {
//                    for (int i = 1; i < 10; i++) {  // 1칸씩 땡길꺼라 1부터 돌린다.
//                        results[i - 1] = results[i];
//                    }
//                    results[9] = result;
//                }   else {
//                    results[count++] = result;
//                }

                // 결과를 ArrayList에 저장
                results.add(result);
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(sc.nextLine().equals("remove")){
                    results.remove(0);
                }


                // remove 입력시 삭제

                System.out.println("더 계산하시겠습니까? (exit 시 입력종료)");
                String end = sc.nextLine();
                if (end.equals("exit")) {
                break;
                }

            }

}
}
