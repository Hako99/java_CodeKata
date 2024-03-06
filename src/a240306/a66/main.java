package a240306.a66;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
문제 설명
휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다.
키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.

예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면
1번 키를 한 번 누르면 "A", 두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.

같은 규칙을 적용해 아무렇게나 만든 휴대폰 자판이 있습니다.
이 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있으며,
특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열되어 있습니다.
또, 같은 문자가 자판 전체에 여러 번 할당된 경우도 있고,
키 하나에 같은 문자가 여러 번 할당된 경우도 있습니다.
심지어 아예 할당되지 않은 경우도 있습니다.
따라서 몇몇 문자열은 작성할 수 없을 수도 있습니다.

이 휴대폰 자판을 이용해 특정 문자열을 작성할 때,
키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.

1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과
입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때,
각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지
순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.

단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.

제한사항
1 ≤ keymap의 길이 ≤ 100
1 ≤ keymap의 원소의 길이 ≤ 100
keymap[i]는 i + 1번 키를 눌렀을 때 순서대로 바뀌는 문자를 의미합니다.
예를 들어 keymap[0] = "ABACD" 인 경우 1번 키를 한 번 누르면 A, 두 번 누르면 B, 세 번 누르면 A 가 됩니다.
keymap의 원소의 길이는 서로 다를 수 있습니다.
keymap의 원소는 알파벳 대문자로만 이루어져 있습니다.

1 ≤ targets의 길이 ≤ 100
1 ≤ targets의 원소의 길이 ≤ 100
targets의 원소는 알파벳 대문자로만 이루어져 있습니다.

https://school.programmers.co.kr/learn/courses/30/lessons/160586
 */
public class main {

    public static void main(String[] args) {

        // keymap 의 길이 1~100
        int keymapLength = (int) (Math.random() * 99) + 1;

        String[] keymap = new String[keymapLength];
        //keymap 값 부여하기
        for (int i = 0; i < keymap.length; i++) {
            // keymap의 원소의 길이 1~100
            int keymapElementLength = (int) (Math.random() * 99) + 1;
            String a = "";
            for (int j = 0; j < keymapElementLength; j++) {
                String b = String.valueOf((char) ((int) (Math.random() * 26) + 65));
                a = a + b;
            }
            keymap[i] = a;

        }
        System.out.println("keymap : ");
        System.out.println(Arrays.toString(keymap));

        // targets 의 길이 1~100
        int targetLength = (int) (Math.random() * 99) + 1;

        String[] targets = new String[targetLength];
        //targets 값 부여하기
        for (int i = 0; i < targets.length; i++) {
            // targets 의 원소의 길이 1~100
            int targetElementLength = (int) (Math.random() * 99) + 1;
            String a = "";
            for (int j = 0; j < targetElementLength; j++) {
                String b = String.valueOf((char) ((int) (Math.random() * 26) + 65));
                a = a + b;
            }
            targets[i] = a;

        }
        System.out.println("targets : ");
        System.out.println(Arrays.toString(targets));

        //  키 자판 A ~ Z 까지 Key, Value 값으로 저장하기
        Map<String, Integer> keyMapper = new HashMap<>();

        int min;
        for (int i = 0; i < 26; i++) {
            char alp = (char) (int) (i + 65);
            min = 200;
            //알파벳 A ~ Z
            for (int j = 0; j < keymap.length; j++) {    // 1번키 ~ 100번키 까지
                char[] keyChar = keymap[j].toCharArray();
                for (int k = 0; k < keyChar.length; k++) { // 해당 키의 몇번클릭
                    if (alp == keyChar[k]) {
                        int keyCheck = k + 1;
                        if (keyCheck < min) {
                            min = keyCheck;
                        }
                    }
                }
            }
            keyMapper.put(String.valueOf(alp), min);
        }
        for (Entry<String, Integer> entrySet : keyMapper.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {// 타겟 값 하나씩 가져오기
            boolean create = true;
            //i 번 타겟
            int targetsI = 0;    // i 번 타겟 만드는게 들어간 횟수
            char[] targetChar = targets[i].toCharArray();    // i 번 타겟 값을 char 배열로
            for (int j = 0; j < targetChar.length; j++) {
                int value = keyMapper.get(String.valueOf(targetChar[j]));
                if (value == 200) {
                    create = false;
                }
                targetsI = targetsI + value;
            }
            if (create == false) {
                answer[i] = -1;
            } else {
                answer[i] = targetsI;
            }
        }

        System.out.println(Arrays.toString(answer));

    }

}
