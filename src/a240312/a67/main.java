package a240312.a67;
/*
문제 설명
두 문자열 s와 skip, 그리고 자연수 index가 주어질 때,
다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.

문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
skip에 있는 알파벳은 제외하고 건너뜁니다.
예를 들어 s = "aukks", skip = "wbqd", index = 5일 때,
a에서 5만큼 뒤에 있는 알파벳은 f지만 [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다.
따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다.
나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.

두 문자열 s와 skip, 그리고
자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.


제한사항
5 ≤ s의 길이 ≤ 50
1 ≤ skip의 길이 ≤ 10
s와 skip은 알파벳 소문자로만 이루어져 있습니다.
skip에 포함되는 알파벳은 s에 포함되지 않습니다.
1 ≤ index ≤ 20
 */

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        // 문자열 s  5 ~ 50 길이
        int sLength = (int) (Math.random() * 46) + 5;
        char[] sChar = new char[sLength];
        for (int i = 0; i < sChar.length; i++) {
            int c = (int) (Math.random() * 26) + 97; // 97~122 랜덤 숫자 부여 (알파벳 소문자)
            sChar[i] = (char) c;
        }
        String s = String.valueOf(sChar);
        System.out.println("주어진 문자열 : " + s);

        // 문자열 skip 1 ~ 10 길이
        int skipLength = (int) (Math.random() * 10) + 1;
        char[] skipChar = new char[skipLength];
        for (int i = 0; i < skipChar.length; i++) {
            int c = (int) (Math.random() * 26) + 97; // 97~122 랜덤 숫자 부여 (알파벳 소문자)
            skipChar[i] = (char) c;
        }
        String skip = String.valueOf(skipChar);
        System.out.println("암호화 건너뛸 문자열 : " + skip);

        // 암호화 인덱스 1 ~ 20
        int index = (int) (Math.random() * 20) + 1;
        System.out.println("암호화 인덱스 : " + index);

        char[] sChr = s.toCharArray();
        char[] skipChr = skip.toCharArray();
        // 알파벳 전체를 키밸류 방식으로 저장하기

        List<Character> alp = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alp.add((char) (i + 97));
        }

        for (char a : alp) {
            System.out.print(a);
        }
        System.out.println();

        // skip 에 있는 값들 리스트에서 지우기
        for (Character a : skipChr) {
            alp.remove(a);
        }

        for (char a : alp) {
            System.out.print(a);
        }
        System.out.println();

        // 변환하기
        for(int i = 0; i<s.length();i++){
            Character a = sChr[i];
            int alpIdx = alp.indexOf(a);
            alpIdx = alpIdx + index;
            if(alpIdx >= alp.size()){
                alpIdx = alpIdx - alp.size();
            }
            sChr[i] = alp.get(alpIdx);
        }
        String answer = new String(sChr);
        System.out.println(answer);

    }
}
