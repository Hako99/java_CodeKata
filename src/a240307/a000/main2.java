package a240307.a000;

import java.util.Arrays;
import java.util.Objects;

public class main2 {

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

        // 주어진 첫 좌표 h , w
        int h = (int) (Math.random() * boardSize);  // 줄
        int w = (int) (Math.random() * boardSize);  // 번째
        System.out.println("고른곳 : " + (h + 1) + " 번째줄 " + (w + 1) + "번째 칸");

        System.out.println(board[h][w]);

/*
1. 정수를 저장할 변수 n을 만들고 board의 길이를 저장합니다.
2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
    4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
    4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
        4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
5. count의 값을 return합니다.
*/
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check =h+dh[i];
            int w_check =w+dw[i];

            if((h_check>=0 && h_check <n)&&(w_check>=0 && w_check <n)){
                if(Objects.equals(board[h][w], board[h_check][w_check])){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }

}
