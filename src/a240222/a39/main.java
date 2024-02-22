package a240222.a39;
/*
문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12940?language=java
 */

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 999999) + 1;
        int m = (int) (Math.random() * 999999) + 1;

        System.out.println("숫자 : " + n + " , " + m);
        if (n > m) {   // m 값이 더 크게 자리 설정
            int a = n;
            n = m;
            m = a;
        }
        int a = n;
        int b = m;
        //최대 공약수
        int greatestDicisor = 1;
        int divisor = 2;
        while (divisor <= n) {
            if (a % divisor == 0 && b % divisor == 0) {
                greatestDicisor = greatestDicisor * divisor;
                a = a / divisor;
                b = b / divisor;
                divisor = 1;
            }
            divisor++;
        }
        System.out.println("최대 공약수 : " + greatestDicisor);


        //최소 공배수
        a = n / greatestDicisor;
        b = m / greatestDicisor;

        int leastMultiple = greatestDicisor * a * b;
        System.out.println("최소 공배수 : "+ leastMultiple);

        int[] answer = new int[2];
        answer[0] = greatestDicisor;
        answer[1] = leastMultiple;
        System.out.println(Arrays.toString(answer));
    }

}
