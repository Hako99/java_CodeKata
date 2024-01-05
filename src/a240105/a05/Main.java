package a240105.a05;
/*
문제 설명
정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ num1 ≤ 10,000
0 ≤ num2 ≤ 10,000
 */

//https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class Main {
    public static void main(String[] args) {

        int num1 = (int) (Math.random()*10000);
        int num2 = (int) (Math.random()*10000);

        int answer = 0;
        if (num1 == num2){
            answer = 1;
        } else {
            answer = -1;
        }

        System.out.println("num1 : "+ num1 + " , num2 : "+num2);
        System.out.println(answer);
    }
}
