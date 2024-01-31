package a240131.a31;
/*
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 9999)+1;
        String answer = "";

        for(int i = 0; i < n ; i++){
            if(i % 2 == 1 ){
                answer = answer + "박";
            }else {
                answer = answer +"수";
            }
        }
        System.out.println("길이 : "+n);
        System.out.println(answer);

    }
}
