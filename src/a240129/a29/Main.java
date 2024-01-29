package a240129.a29;
/*
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 8) + 1;
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            int b = (int) (Math.random() * 9);
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (b == arr[j]) {
                    c = 1;
                }
            }
            if (c == 0) {
                arr[i] = b;
            } else {
                i--;
            }
        }
        System.out.println("주어진 숫자 배열");
        System.out.println(Arrays.toString(arr));

        if(arr.length == 1){
            int[] answer = {-1};
            System.out.println(answer);
        }else {
            int arrmin = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arrmin > arr[i]) {
                    arrmin = arr[i];
                }
            }
            int ansidx = 0;
            int[] answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arrmin) {
                    answer[ansidx] = arr[i];
                    ansidx++;
                }
            }

            System.out.println("arr 에서 가장 작은 수를 제거한 배열");
            System.out.println(Arrays.toString(answer));
        }
    }
}
