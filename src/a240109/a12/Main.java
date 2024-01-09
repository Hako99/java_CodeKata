package a240109.a12;

/*
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */

// https://school.programmers.co.kr/learn/courses/30/lessons/12944

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int arrlength =  (int) (Math.random() * 100);
    int[] arr = new int[arrlength];
    for (int i = 0;i<arr.length;i++){
        arr[i] =  (int) (Math.random() * 20000) -10000;
    }
        double answer = 0;
        for (int i = 0; i<arr.length;i++){
            answer = answer + arr[i];

        }
        answer = answer / arr.length;


        System.out.println("배열 arr : " + Arrays.toString(arr));
        System.out.println("평균값 : " + answer);



    }

}
