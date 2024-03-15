package a240315.a72;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class main2 {

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

        // 해설자가 부를 callings 을 지정
        int callingsLength = (int) (Math.random() * 999) + 2;
        String[] callings = new String[callingsLength];
        for (int i = 0; i < callingsLength; i++) {
            int callingsNum = (int) (Math.random() * players.length - 10) + 11;
            String callingsName = players[callingsNum];
            callings[i] = callingsName;
        }

        ///////////////////////////////////

        //랭킹 이라는 이름으로 플레이어들의 등수를 표기할것임
        int numOfPlayers = players.length;
        Map<String, Integer> ranking = new HashMap<>();

        // 플레이어의 수만큼 반복해서
        // 현재 플레이어의 index = 등수니 바로 현재 등수대로 집어넣음
        for (int i = 0; i < numOfPlayers; i++) {
            ranking.put(players[i], i);
        }

        //경주 진행
        for (String player : callings) {
            //1) player의 이름에 해당하는 value를 저장한다.
            // 키값을 이름으로 했으니 등수가 밸류라서 get으로 뽑아옴
            int playerRanking = ranking.get(player);

            //2) player보다 앞에 있는 사람을 발견하고, value를 변경함
            String frontPlayer = players[playerRanking - 1];

            // 본인, 앞사람 서로 등수를 수정해줌.
            ranking.replace(frontPlayer, playerRanking);
            players[playerRanking] = frontPlayer;

            //3) player의 랭킹을 앞으로 변경함.
            ranking.replace(player, playerRanking - 1);
            players[playerRanking - 1] = player;
        }




    }

}
