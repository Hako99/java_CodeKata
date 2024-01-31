package a240131.a33;
/*
문제 설명
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고,
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000

https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
public class Main {
    public static void main(String[] args) {
        int left = (int) (Math.random() * 999)+1;
        int right = (int) (Math.random() * 999)+1;
        int path =0;
        int answer = 0;
        if(left > right){
            path = left;
            left = right;
            right = left;
        }

        for(int i = left;i<=right;i++){
            int a = 0;
            for(int j =1; j<=i;j++){
                if(i % j == 0){
                    a = a+1;
                }
            }


            if(a%2==0){
                answer = answer + i;
            }else{
                answer = answer - i;
            }

        }
        System.out.println("left : " + left);
        System.out.println("right : " + right);
        System.out.println("result : " + answer);

    }
}
