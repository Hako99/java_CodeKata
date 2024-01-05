package a240105.a02;
//문제 설명
//        정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 ≤ num1 ≤ 100
//0 ≤ num2 ≤ 100

//https://school.programmers.co.kr/learn/courses/30/lessons/120804
public class Main {
    public static void main(String[] args) {

        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*100);

        int answer = 0;
        answer = num1 *num2;
        System.out.println("num1 : "+ num1 + " , num2 : "+num2);
        System.out.println(answer);

    }
}
