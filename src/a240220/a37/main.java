package a240220.a37;

import java.util.Arrays;

/*
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12950?language=java
 */
public class main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 50) + 1; // 행의 크기
        int b = (int) (Math.random() * 50) + 1; // 열의 크기
            // 500이라 했지만 보기 힘드니 50까지만
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr1[i][j] = (int) (Math.random() * 9);
                arr2[i][j] = (int) (Math.random() * 9); //arr1 과 2 에 각각 0~9 랜덤 숫자 기입
            }
        }

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        int[][] answer = new int [a][b];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }

}
