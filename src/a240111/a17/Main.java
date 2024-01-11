package a240111.a17;

/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
 */

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long n = (int) (Math.random() * 1000000000);
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];

        for (int i = a.length() - 1; i >= 0; i--) {
            answer[a.length() - 1 - i] = a.charAt(i) - '0';
        }


        System.out.println(n);
        System.out.println(Arrays.toString(answer));
    }

}

