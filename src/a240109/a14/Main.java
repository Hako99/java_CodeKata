package a240109.a14;
/*
문제 설명
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 정수입니다.
 */

// https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3000);
        int answer = 0;
        int i = 0;
        System.out.println("n 값 : " + n);
        System.out.print("약수 값 : ");
        while (true){
            i++;
            if(i>n){
                break;
            }
            if(n%i==0){
                System.out.print(i+" , ");
                answer=answer +i;
            }else {
                continue;
            }
        }
        System.out.println();
        System.out.println(answer);


    }
}
