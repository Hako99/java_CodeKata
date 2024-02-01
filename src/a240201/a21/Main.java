package a240201.a21;
/*
문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한 조건
x는 1 이상, 10000 이하인 정수입니다.

입출력 예 설명
입출력 예 #1
10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.

입출력 예 #2
12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.

입출력 예 #3
11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.

입출력 예 #4
13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */

public class Main {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 9999) + 1;
        System.out.println("랜덤수 : " + x);
        // 모든 자릿수의 합을 구하자
        int b = 0;
        int c = x;
        while (true) {
            if (c == 0) {
                break;
            }
            b = b + (c % 10);
            c = c / 10;
        }
        System.out.println("모든 자리수의 합 : " + b);

        // 처음숫자 / 모든자리수의 합   이 딱 떨어지는지 체크
        boolean answer = true;
        if (x % b == 0) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println("하샤드 수 인가요? : " + answer);
    }

}
