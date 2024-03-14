package a240314.a70;

import java.util.Arrays;

/*
문제 설명
코딩테스트를 준비하는 머쓱이는 프로그래머스에서 문제를 풀고 나중에 다시 코드를 보면서 공부하려고
작성한 코드를 컴퓨터 바탕화면에 아무 위치에나 저장해 둡니다.
저장한 코드가 많아지면서 머쓱이는 본인의 컴퓨터 바탕화면이 너무 지저분하다고 생각했습니다.
프로그래머스에서 작성했던 코드는 그 문제에 가서 다시 볼 수 있기 때문에
저장해 둔 파일들을 전부 삭제하기로 했습니다.

컴퓨터 바탕화면은 각 칸이 정사각형인 격자판입니다.
이때 컴퓨터 바탕화면의 상태를 나타낸 문자열 배열 wallpaper가 주어집니다.
파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은
바탕화면의 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현합니다.
빈칸은 ".", 파일이 있는 칸은 "#"의 값을 가집니다.
드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있습니다.
머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며
드래그로 파일들을 선택하는 방법은 다음과 같습니다.

드래그는 바탕화면의 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 상태로
격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행동입니다.
이때, "점 S에서 점 E로 드래그한다"고 표현하고 점 S와 점 E를 각각 드래그의 시작점, 끝점이라고 표현합니다.

점 S(lux, luy)에서 점 E(rdx, rdy)로 드래그를 할 때,
"드래그 한 거리"는 |rdx - lux| + |rdy - luy|로 정의합니다.

점 S에서 점 E로 드래그를 하면 바탕화면에서 두 격자점을
각각 왼쪽 위, 오른쪽 아래로 하는 직사각형 내부에 있는 모든 파일이 선택됩니다.
머쓱이의 컴퓨터 바탕화면의 상태를 나타내는 문자열 배열 wallpaper가 매개변수로 주어질 때
바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는
드래그의 시작점과 끝점을 담은 정수 배열을 return하는 solution 함수를 작성해 주세요.
드래그의 시작점이 (lux, luy), 끝점이 (rdx, rdy)라면 정수 배열 [lux, luy, rdx, rdy]를 return하면 됩니다.

제한사항
1 ≤ wallpaper의 길이 ≤ 50
1 ≤ wallpaper[i]의 길이 ≤ 50
wallpaper의 모든 원소의 길이는 동일합니다.
wallpaper[i][j]는 바탕화면에서 i + 1행 j + 1열에 해당하는 칸의 상태를 나타냅니다.
wallpaper[i][j]는 "#" 또는 "."의 값만 가집니다.
바탕화면에는 적어도 하나의 파일이 있습니다.
드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족해야 합니다.
 */
public class main {

    public static void main(String[] args) {

        // String 배열 크기는 최대 1 ~ 50 제곱
        // 2차 배열이 아닌 값 1개에 1줄의 값이표현되는 1차 배열
        int wallpaperW = (int) (Math.random() * 50) + 1;
        int wallpaperH = (int) (Math.random() * 50) + 1;
        String[] wallpaper = new String[wallpaperH];

        for (int i = 0; i < wallpaper.length; i++) {
            StringBuilder paper = new StringBuilder();
            for (int j = 0; j < wallpaperW; j++) {
                int p = (int) (Math.random() * 2);
                if (p == 0) {
                    paper.append(".");
                } else {
                    paper.append("#");
                }
            }
            wallpaper[i] = String.valueOf(paper);
        }
        System.out.println(Arrays.toString(wallpaper));


        // 좌상단과 우하단의 값 구하기
        int lux = wallpaper.length;    // 좌상 x 좌표
        int luy = wallpaper[0].length();    // 좌상 y 좌표
        int rdx = 0;    // 우하 x 좌표
        int rdy = 0;    // 우하 y 좌표
        System.out.println(lux +" "+ luy +" "+ rdx +" "+ rdy);

        for (int i = 0; i < wallpaper.length; i++) {
            char[] wallpaperChar = wallpaper[i].toCharArray();
            for (int j = 0; j < wallpaperChar.length; j++) {
                if (wallpaperChar[j] == '#') {
                    if (i < lux+1) {
                        lux = i;
                        System.out.println("lux : " +lux);
                    }
                    if (j < luy+1) {
                        luy = j;
                        System.out.println("luy : " +luy);
                    }

                    if (i> rdx-1){
                        rdx = i+1;
                        System.out.println("rdx : " +rdx);
                    }
                    if ( j > rdy-1){
                        rdy = j+1;
                        System.out.println("rdy : " +rdy);
                    }
                }
            }
        }

        int[] answer = {lux, luy, rdx, rdy};
        System.out.println(Arrays.toString(answer));

    }

}
