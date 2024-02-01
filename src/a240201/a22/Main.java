package a240201.a22;

/*
문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12912?language=java
 */
public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 20000000) - 10000000;
        int b = (int) (Math.random() * 20000000) - 10000000;
        System.out.println("a 의 값 : " + a);
        System.out.println("b 의 값 : " + b);
        Long answer = 0L;
        // 만약 같은 수면 둘중 아무거나 반환
        if (a == b) {
            answer = (long) a;
        } else {
            if (a > b) {
                int changer = a;
                a = b;
                b = changer;
            }
            for (int i = a; i <= b; i++) {
                answer = answer + (long) i;
            }
            System.out.println("a~b 모든 숫자의 합 : " + answer);

        }
    }
}