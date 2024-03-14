package a240313.a000;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

/*
문제 설명
게임개발자인 "죠르디"는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.
"죠르디"는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 합니다.


게임 화면은 "1 x 1" 크기의 칸들로 이루어진 "N x N" 크기의 정사각 격자이며
위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.
각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.
모든 인형은 "1 x 1" 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다.
집어 올린 인형은 바구니에 쌓이게 되는 데,
이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.

만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면
두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.

크레인 작동 시 인형이 집어지지 않는 경우는 없으나
만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.
또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다.

게임 화면의 격자의 상태가 담긴 2차원 배열 board와
인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

[제한사항]
board 배열은 2차원 배열로 크기는 "5 x 5" 이상 "30 x 30" 이하입니다.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
moves 배열의 크기는 1 이상 1,000 이하입니다.
moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */
public class main {

    public static void main(String[] args) {
        // board 배열 만들기
        // 배열 크기는 5 ~30
        int boardSize = (int) (Math.random() * 26) + 5;
        int[][] board = new int[boardSize][boardSize];

        // board 각 칸에는 0 ~ 100의 정수가 담긴다.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("주어진 2차원 배열");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

        // moves 배열 부여
        // moves 배열의 크기는 1 ~ 1000
        int movesSize = (int) (Math.random() * 1000) + 1;
        // 배열의 값은 1 ~ board 길이
        int[] moves = new int[movesSize];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = (int) (Math.random() * board.length) + 1;
        }
        System.out.println("뽑을 배열");
        System.out.println(Arrays.toString(moves));
        // moves 의 값은 인덱스로 쓰려면 -1 해야함

        for (int i = 0; i < moves.length; i++) {
            moves[i] = moves[i] - 1;
        }
        // 인형을 뽑아서 담을 통
        Stack<Integer> out = new Stack<>();

        // 인형이 터져 사라진 카운트
        int count = 0;

        // moves 값 만큼 반복
        for (int i = 0; i < moves.length; i++) {
            // move 의 현재값의 위치의 board 에서 값을 가져옴
            for (int j = 0; j < board.length; j++) {
                // 만약 board[i] 에서 첫값부터 보는데 0이면 다음값으로
                // 0이 아니면 해당 값을 뽑아 담는 통에 넣고
                // board[i][j] 에는 0을 넣음
                if (board[j][moves[i]] != 0) {
                    out.push(board[j][moves[i]]);
                    System.out.println(board[j][moves[i]] + "넣음");
                    board[j][moves[i]] = 0;
                    // 만약 마지막 값과 마지막 전 값이 같은것이면
                    // 마지막 2개 제거

                    if ((out.size() > 1) && (Objects.equals(out.get(out.size() - 1),
                        out.get(out.size() - 2)))) {
                        count++;
                        count++;
                        out.pop();
                        out.pop();
                    }
                    break;
                }

            }
        }
        System.out.println("터트린 인형 카운트 : " + count);
    }
}
