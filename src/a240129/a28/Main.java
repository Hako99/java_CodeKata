package a240129.a28;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.

https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 8) + 1;
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            int b = (int) (Math.random() * 9);
            int c = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (b == numbers[j]) {
                    c = 1;
                }
            }
            if (c == 0) {
                numbers[i] = b;
            } else {
                i--;
            }
        }
        System.out.println("주어진 숫자 배열");
        System.out.println(Arrays.toString(numbers));

        int answer = 45;
        for(int i = 0; i<numbers.length;i++){
            answer = answer - numbers[i];
        }
        System.out.println("0~9중 없는 숫자들을 더한 값");
        System.out.println(answer);
    }

}


