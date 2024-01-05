package a240105.a09;
/*
문제 설명
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

제한사항
0 < n ≤ 1000
 */

//https://school.programmers.co.kr/learn/courses/30/lessons/120831

public class Main {
    public static void main(String[] args) {

        int n = (int) (Math.random()*1000);

        int answer = 0;
        for(int i = 2; i <= n; i += 2 ){
            answer = answer + i;
        }

        System.out.println("n : "+ n );
        System.out.println(answer);

    }
}
