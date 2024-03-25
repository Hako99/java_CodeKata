package a240325.a91;
/*
문제 설명
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다.
예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    // 작업의 개수 progresses
    int progressesLength = (int) (Math.random() * 100) + 1;
    int[] progresses = new int[progressesLength];
    for (int i = 0; i < progressesLength; i++) {
      progresses[i] = (int) (Math.random() * 100);
    }
    //작업 속도 speeds
    int[] speeds = new int[progressesLength];
    for (int i = 0; i < progressesLength; i++) {
      speeds[i] = (int) (Math.random() * 10) + 1;
    }

    System.out.println(Arrays.toString(progresses));
    System.out.println(Arrays.toString(speeds));

    //결과를 반환할 int 형을 담는 ArrayList answer 선언
    // progresses 의 각 인덱스 값이 100을 넘는 최소일수를 담을 Queue completeDay 선언
    ArrayList<Integer> answerArrayList = new ArrayList<Integer>();
    Queue<Integer> completeDay = new LinkedList<Integer>();

    for (int i = 0; i < progresses.length; i++) {
      //progresses 각 인덱스 값이 100을 넘기 위한 최소일수 계산 후 completeDay 에 add 메소드로 넣기
      completeDay.add((int) ((100.0 - progresses[i]) / speeds[i]));
    }

    // completeDay 가 빌 때까지 while 문을 돌면서
    while (!completeDay.isEmpty()) {
      //completeDay 에서 꺼낸 값을 minDays 에 저장
      int minDays = completeDay.poll();
      //해당 일자에 배포되는 총 기능의 수를 담기 위한 변수, int count 를 1로 선언 및 초기화
      int count = 1;

      //completeDay 가 비어있지 않고,
      //completeDay.peek()의 값이 그 전에 poll()을 통해 얻은 값, 즉 minDays 보다 작은 동안

      while (!completeDay.isEmpty() && completeDay.peek() <= minDays) {
        completeDay.poll();
        count++;
      }
      //count의 값을 answer배열에 추가
      answerArrayList.add(count);
    }
    System.out.println(answerArrayList);
    int[] answer = new int[answerArrayList.size()];
    int size = 0;
    for(int temp : answerArrayList){
      answer[size++] = temp;
    }
  }

}
