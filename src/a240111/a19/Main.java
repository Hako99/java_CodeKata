package a240111.a19;
/*
문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.

 */

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Main {
    public static void main(String[] args) {
        long n = (int) (Math.random() * 500000000);
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            long a = n / i;
            long b = n % i;
            if (i == a) {
                if (b == 0) {
                    answer = (a + 1) * (a + 1);
                    break;
                }
            } else if (i >= n) {
                answer = -1;
                break;
            }
        }
        System.out.println(n);
        System.out.println(answer);
    }
}

