package a240320.a84;
/*
문제 설명
다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다.
예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다.
예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
s의 길이는 1 이상 1,000 이하입니다.
 */

import java.util.Stack;

public class main {

  public static void main(String[] args) {
    // 괄호 배열 s 부여
//    int sLength = (int) ((Math.random() * 500) + 1)*2;

//    int sLength = 10;
//    String s = "";
//    for (int i = 0; i < sLength; i++) {
//      int sRandom = (int) (Math.random() * 6) + 1;
//      s = switch (sRandom) {
//        case 1 -> s + "(";
//        case 2 -> s + ")";
//        case 3 -> s + "[";
//        case 4 -> s + "]";
//        case 5 -> s + "{";
//        case 6 -> s + "}";
//        default -> s;
//      };
//    }
    String s = "}]()[{";
    System.out.println(s);
    int countX = 0;
    for (int i = 0; i < s.length(); i++) {
      char temp = s.charAt(0);
      s = s.substring(1) + temp;

      Stack<Character> sStack = new Stack<>();
      char[] sArr = s.toCharArray();

      for (char data : sArr) {
        if (sStack.isEmpty()) {
          sStack.push(data);
        } else if (sStack.peek() == '[' && data == ']') {
          sStack.pop();
        } else if (sStack.peek() == '(' && data == ')') {
          sStack.pop();
        } else if (sStack.peek() == '{' && data == '}') {
          sStack.pop();
        } else {
          sStack.push(data);
        }
      }
      if (sStack.isEmpty()) {
        countX++;
      }
      System.out.println(countX);

    }

  }
}



