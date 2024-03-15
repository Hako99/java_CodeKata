package a240315.a72;
/*
문제 설명
얀에서는 매년 달리기 경주가 열립니다.
해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다.
예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때,
해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다.
즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와
해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때,
경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.

제한사항
5 ≤ players의 길이 ≤ 50,000
players[i]는 i번째 선수의 이름을 의미합니다.
players의 원소들은 알파벳 소문자로만 이루어져 있습니다.
players에는 중복된 값이 들어가 있지 않습니다.
3 ≤ players[i]의 길이 ≤ 10
2 ≤ callings의 길이 ≤ 1,000,000
callings는 players의 원소들로만 이루어져 있습니다.
경주 진행중 1등인 선수의 이름은 불리지 않습니다.

https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class main {

    public static void main(String[] args) {
        //플레이어 지정
        int playersLength = (int) (Math.random() * 49996) + 5;

        HashSet<String> playersSet = new HashSet<>();

        for (int i = 0; i < playersLength; i++) {
            int playersNameLength = (int) (Math.random() * 8) + 3;
            char[] playersName = new char[playersNameLength];
            for (int j = 0; j < playersName.length; j++) {
                playersName[j] = (char) ((int) (Math.random() * 26) + 97);
            }
            playersSet.add(String.valueOf(playersName));
        }
        String[] players = playersSet.toArray(new String[playersSet.size()]);

        System.out.println(Arrays.toString(players));
        System.out.println();
        System.out.println();
        System.out.println();

        // 해설자가 부를 callings 을 지정
        int callingsLength = (int) (Math.random() * 999) + 2;
        String[] callings = new String[callingsLength];
        for (int i = 0; i < callingsLength; i++) {
            int callingsNum = (int) (Math.random() * players.length-10) + 11;
            String callingsName = players[callingsNum];
            callings[i] = callingsName;
        }
        System.out.println(Arrays.toString(callings));


        // 선수 목록을 리스트로
        List<String> playersList = Arrays.asList(players);

        for(int i = 0 ; i < callings.length;i++){
            int playersWhere = playersList.indexOf(callings[i]);
            String playerFirst = playersList.get(playersWhere-1);
            String playerSecond = playersList.get(playersWhere);
            playersList.set(playersWhere-1,playerSecond);
            playersList.set(playersWhere,playerFirst);
        }

        String[] answer = playersList.toArray(new String[playersList.size()]);

        System.out.println(Arrays.toString(answer));

    }

}
