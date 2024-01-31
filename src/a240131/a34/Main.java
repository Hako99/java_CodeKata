package a240131.a34;
/*
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.

입출력 예
    s	    return
"Zbcdefg"	"gfedcbZ"


https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=java
 */


public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 50) + 1;
        String s = "";
        char c;
        for (int i = 0; i < a; i++) {
            int b = (int) (Math.random() * 25) + 97;
            c = (char) b;
            s = s + c;
        }
        System.out.println("랜덤 문자열");
        System.out.println(s);

        char[] sCharArray = s.toCharArray();
        char changer;

        for (int i = 0; i < sCharArray.length; i++) {
            for (int j = i + 1; j < sCharArray.length; j++) {
                if (sCharArray[i] < sCharArray[j]) {
                    changer = sCharArray[i];
                    sCharArray[i] = sCharArray[j];
                    sCharArray[j] = changer;
                }
            }
        }

        String answer = String.valueOf(sCharArray);

        System.out.println(answer);


    }


}
