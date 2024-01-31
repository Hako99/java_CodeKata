package a240131.a32;

import java.util.Arrays;

/*
문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 999)+1;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0; i < n ; i++){
            a[i] =  (int) (Math.random() * 2000)-1000;
            b[i] =  (int) (Math.random() * 2000)-1000;
        }

        System.out.println("배열 길이 : "+n);
        System.out.println("a 배열");
        System.out.println(Arrays.toString(a));
        System.out.println("b 배열");
        System.out.println(Arrays.toString(b));

        int answer = 0;
        for(int i = 0; i<a.length;i++){
            int c = a[i] * b[i];
            answer = answer +c;
        }
        System.out.println("내적 : "+ answer);




    }
}
