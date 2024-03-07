package a240307.a000;
/*
문제 설명
각 칸마다 색이 칠해진 2차원 격자 보드판이 있습니다.
그중 한 칸을 골랐을 때, 위, 아래, 왼쪽, 오른쪽 칸 중 같은 색깔로 칠해진 칸의 개수를 구하려고 합니다.

보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board와
고른 칸의 위치를 나타내는 두 정수 h, w가 주어질 때 board[h][w]와
이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수를 return 하도록 solution 함수를 완성해 주세요.

이웃한 칸들 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확인하는 과정은 다음과 같습니다.

1. 정수를 저장할 변수 n을 만들고 board의 길이를 저장합니다.
2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
    4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고
        각각 h + dh[i], w + dw[i]를 저장합니다.
    4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
        4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
5. count의 값을 return합니다.

위의 의사코드와 작동방식이 다른 코드를 작성해도 상관없습니다.
제한사항
1 ≤ board의 길이 ≤ 7
board의 길이와 board[n]의 길이는 동일합니다.
0 ≤ h, w < board의 길이
1 ≤ board[h][w]의 길이 ≤ 10
board[h][w]는 영어 소문자로만 이루어져 있습니다.
 */

import java.util.Arrays;
import java.util.Objects;

public class main {

    public static void main(String[] args) {
        // board 만들기 1~7 제곱
        int boardSize = (int) (Math.random() * 6) + 1;
        String[][] board = new String[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                int randomColor = (int) (Math.random() * 5);
                switch (randomColor) {
                    case 0:
                        board[i][j] = "red";
                        break;
                    case 1:
                        board[i][j] = "green";
                        break;
                    case 2:
                        board[i][j] = "blue";
                        break;
                    case 3:
                        board[i][j] = "yellow";
                        break;
                    case 4:
                        board[i][j] = "orange";
                        break;
                }
            }
        }
        for (int i = 0; i < boardSize; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        int n = board.length;
        // 주어진 첫 좌표 h , w
        int h = (int) (Math.random() * n-1);  // 줄
        int w = (int) (Math.random() * n-1);  // 번째
        System.out.println("고른곳 : " + (h + 1) + " 번째줄 " + (w + 1) + "번째 칸");

        System.out.println(board[h][w]);

//        // 사방 4개의 값을 체크하자
//        int answer = 0;
//        if (h != 0 && Objects.equals(board[h][w], board[h - 1][w])) {
//            answer++;
//        }
//        if (h != n && Objects.equals(board[h][w], board[h + 1][w])) {
//            answer++;
//        }
//        if (w != 0 && Objects.equals(board[h][w], board[h][w - 1])) {
//            answer++;
//        }
//        if (w != n && Objects.equals(board[h][w], board[h][w + 1])) {
//            answer++;
//        }
//        System.out.println(answer);

        // 사방 4개의 값을 체크하자
        String up; // h 값이 0이면 null
        String down; // h 값이 board[0].length 와 같으면 null
        String left; // w 값이 0 이면 null
        String right; // w 값이 board[0].length 와 같으면 null
        if(h==0){
            up = null;
        }else{
            up = board[h-1][w];
        }
        if(h==board[0].length-1){
            down = null;
        }else{
            down = board[h+1][w];
        }
        if(w==0){
            left = null;
        }else{
            left = board[h][w-1];
        }
        if(w==board[0].length-1){
            right = null;
        }else{
            right = board[h][w+1];
        }
        System.out.println("상 : " + up);
        System.out.println("하 : " + down);
        System.out.println("좌 : " + left);
        System.out.println("우 : " + right);

        int answer = 0;
        if(Objects.equals(board[h][w], up)){
            answer ++;
        }
        if(Objects.equals(board[h][w], down)){
            answer ++;
        }
        if(Objects.equals(board[h][w], left)){
            answer ++;
        }
        if(Objects.equals(board[h][w], right)){
            answer ++;
        }
        System.out.println(answer);

        // 왠지 모르게 사이트에 쓰면 런타임 에러가 난다.
        // 길이는 1~ 지만, index 는 0부터 이기에 상하 좌우 체크하는 if에
        // 인덱스값과 길이를 비교해서
        // 벽지점에서 상하좌우시 길이를 넘어서는 값이 입력되어 생기는 런타임 에러였음. 해결
    }


}
