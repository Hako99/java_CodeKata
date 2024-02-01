package a240201.a20;

import java.util.Arrays;

/*
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Main {
    public static void main(String[] args) {
        Long n = (long) ((Math.random() * 799999999) + 1);
        System.out.println("입력받은 랜덤 정수 : " + n);

        // 랜덤 정수를 한글자씩 분해해서 int 배열에 넣자
        Long a = n;
        int b = 0;
        while (true) {
            b = b + 1;
            a = a / 10;
            if (a == 0) {
                break;
            }
        }
        System.out.println("몇자리숫자인가? : " + b);
        int[] c = new int[b];
        a = n;
        for (int i = 0; i < b; i++) {
            c[i] = (int) (a % 10);
            a = a / 10;
        }
        System.out.println("배열로 만든 n");
        System.out.println(Arrays.toString(c));

        // 정렬하자

        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] < c[j + 1]) {
                    int changer = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = changer;
                }
            }
        }
        System.out.println("정렬 완료된 n");
        System.out.println(Arrays.toString(c));
        // 다시 배열을 Long 타입 숫자로 바꾸기
        Long answer = 0L;
        for (int i = 0; i < c.length; i++) {
            answer = answer * 10;
            answer = answer + c[i];
        }
        System.out.println(answer);


    }
}
