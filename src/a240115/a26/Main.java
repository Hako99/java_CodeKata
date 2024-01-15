package a240115.a26;

/*
문제 설명
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

제한사항
absolutes의 길이는 1 이상 1,000 이하입니다.
absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
signs의 길이는 absolutes의 길이와 같습니다.
signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다

https://school.programmers.co.kr/learn/courses/30/lessons/76501

 */

import java.util.Arrays;
import java.util.Random;

public class Main  {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 999)+1;
        int[] absolutes = new int[a];
        for (int i = 0; i < absolutes.length;i++){
            absolutes[i] = (int) (Math.random() * 999)+1;
        }
        boolean[] signs = new boolean[a];
        Random r = new Random();
        for (int i = 0; i < signs.length;i++){
            signs[i] = r.nextBoolean();
        }


        int answer = 123456789;
        int sum = 0;
        for(int i = 0; i<signs.length;i++){  // 배열 길이만큼반복
            if(signs[i] == true){           //true면
                sum = sum +absolutes[i];    // 더하고
            }else if (signs[i] == false){   // false면
                sum = sum - absolutes[i];   // 빼라
            }
        }
        answer = sum;

        System.out.println(Arrays.toString(absolutes));
        System.out.println(Arrays.toString(signs));

        System.out.println(answer);


    }
}
