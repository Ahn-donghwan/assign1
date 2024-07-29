package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App { public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


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

    }
}
