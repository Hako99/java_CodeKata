package a240311.a65;
/*
문제 설명
문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서,
x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다.
처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고,
분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.

제한사항
1 ≤ s의 길이 ≤ 10,000
s는 영어 소문자로만 이루어져 있습니다.


https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */

public class main {

    public static void main(String[] args) {

        // 문자열 부여하기
        int a = (int) (Math.random() * 10000) + 1;  // 1~10000 길이
        char[] b = new char[a];   // 1~100 길이를 가지는 char 배열

        for (int i = 0; i < a; i++) {
            int c = (int) (Math.random() * 26) + 97; // 97~122 랜덤 숫자 부여
            b[i] = (char) c;
        }
        String s = String.valueOf(b);
        System.out.println("받은 문자 : " + s);

        // 첫문자 x
        char x = s.charAt(0);
        // x 와 같은 글자수
        int countX = 0;
        // x 와 다른 글자 수
        int differentX = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            // 만약 첫글자와 현재 글자가 같으면 같은 글자수 카운터 증가
            if (s.charAt(i) == x) {
                countX++;
            }
            // 다르면 다른 글자 수 카운터 증가
            else {
                differentX++;
            }

            // 같은 글자수 카운터와 다른 글자수 카운터가 같으면
            if (countX == differentX) {
                // 결과값 1 상승하고
                answer++;
                // 첫글자 문자를 바꿔줌
                x = s.charAt(i);
            }
        }
        System.out.println(answer);

    }
}
