package a240220.a38;
/*
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */
public class main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 9) + 1;
        int m = (int) (Math.random() * 9) + 1;    //1 ~ 1000 사이 정수 보기힘드니 1~10으로

        System.out.println("가로 : " + n);
        System.out.println("세로 : " + m);
        for(int i = 0 ; i <m; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
