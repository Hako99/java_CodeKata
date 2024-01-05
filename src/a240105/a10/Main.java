package a240105.a10;

import java.util.Arrays;

/*
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ numbers의 원소 ≤ 1,000
1 ≤ numbers의 길이 ≤ 100
정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

 */
//https://school.programmers.co.kr/learn/courses/30/lessons/120817
public class Main {
    public static void main(String[] args) {
        int num_lang = (int) (Math.random()*99) +1;
        int[] numbers = new int[num_lang];
        for(int i = 0; i<num_lang ; i++){
            numbers[i]=(int) (Math.random()*1000);
        }

        System.out.println("배열길이 : "+numbers.length);
        System.out.println(Arrays.toString(numbers));

        double answer = 0;
        for(int i = 0; i < num_lang ; i++){
            answer = answer + numbers[i];
        }
        answer = answer / num_lang;
        System.out.println("평균값 :" +answer);

    }
}
