package a240115.a25;

import java.util.Arrays;

/*
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12910

 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length;i++){
            arr[i] = (int) (Math.random() * 100);
        }
        int divisor = (int) (Math.random() * 9)+1;

        int c = 0 ; // 나누어떨어지는 숫자들 개수
        int j = 0;
        for (int i = 0; i<arr.length; i++){ //arr 갯수만큼 반복
            if(arr[i]%divisor==0){  // 만약 딱 나누어 떨어지면

                c++;     //c의값 1씩상승
            }
        }
        if(c == 0){ // 만약 나누어떨어지는 숫자가 1개도 없으면
            int[] answer ={-1};    // 배열에 -1 을 담아서 반환
            System.out.println(Arrays.toString(answer));
            System.exit(0);
        }
        int[] answer = new int[c];  // answer 의 길이를 c의 개수만큼으로 정함
        for ( int i = 0 ; i<arr.length; i++) { // arr 개수만큼 반복
            if( arr[i] % divisor == 0){ // 딱 나누어 떨어지면
                answer[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(divisor);
        System.out.println(Arrays.toString(answer));

    }
}
