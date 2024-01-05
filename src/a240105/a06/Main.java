package a240105.a06;
/*
문제 설명
정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

제한사항
-50,000 ≤ num1 ≤ 50,000
-50,000 ≤ num2 ≤ 50,000
 */

//https://school.programmers.co.kr/learn/courses/30/lessons/120802
public class Main {
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*100000) -50000;
        int num2 = (int) (Math.random()*100000) -50000;


        int answer = -1;
        answer = num1 + num2 ;

        System.out.println("num1 : "+ num1 + " , num2 : "+num2);
        System.out.println(answer);
    }
}
