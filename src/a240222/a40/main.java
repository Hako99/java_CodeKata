package a240222.a40;
/*
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
 */

public class main {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 99999999) + 1;
        String threeNStr ="";
        // 3진법
        System.out.println("주어진 숫자 : " + n);
        while(true){
            threeNStr += (n % 3);
            n = n/3;
            if(n==0){
                break;
            }
        }
        System.out.println("3진법 뒤집어진 숫자 : " + threeNStr);

        Long threeN = Long.parseLong(threeNStr);
        System.out.println("3진법 뒤집어진 숫자 : " + threeN);
        int answer = Integer.parseInt(threeNStr,3);
        System.out.println("뒤집은 10진법 숫자 : " + answer);


    }
}
