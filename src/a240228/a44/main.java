package a240228.a44;
/*
문제 설명
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
작아서 들고 다니기 편한 지갑을 만들어야 합니다.
이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

제한사항
sizes의 길이는 1 이상 10,000 이하입니다.
sizes의 원소는 [w, h] 형식입니다.
w는 명함의 가로 길이를 나타냅니다.
h는 명함의 세로 길이를 나타냅니다.
w와 h는 1 이상 1,000 이하인 자연수입니다.
 */


import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int sizesLength = (int) (Math.random() * 9999) + 1;
        int[][] sizes = new int [sizesLength][2];

        for (int i = 0; i<sizesLength; i ++){
            sizes[i][0] = (int) (Math.random() * 999) + 1;
            sizes[i][1] = (int) (Math.random() * 999) + 1;
        }

        System.out.println("명함 배열");
        System.out.println(Arrays.deepToString(sizes));
        System.out.println("명함 갯수 : " + sizesLength);
        int maxW =0;    // 가장 큰 너비
        int maxH =0;    // 가장 큰 높이 저장할 곳

        for(int i =0; i<sizes.length; i++){
            if (sizes[i][0]<sizes[i][1]){
                int changer = sizes[i][0];
                sizes[i][0] =  sizes[i][1];
                sizes[i][1] = changer;
            }   // 둘중 큰 숫자를 너비로 교환
            if(sizes[i][0]>maxW){
                maxW = sizes[i][0];
            }//현재 너비 크기가 가장 큰 너비 보다 크면 가장 큰 너비에 저장
            if(sizes[i][1]>maxH){
                maxH = sizes[i][1];
            }//높이도 마찬가지
        }
        System.out.println("가장 큰 지갑의 너비 : " + maxW + "  높이 : " + maxH);
        int answer = maxW * maxH;
        System.out.println("지갑의 크기 : "+answer);

    }

}
