package a240321.a86;
/*
문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다.
 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면
h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 */

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // 발표한 논문 citations
    int citationsLength = (int) (Math.random() * 1000) + 1;
    int[] citations = new int[citationsLength];
    for (int i = 0; i < citations.length; i++) {
      citations[i] = (int) (Math.random() * citationsLength + 1);
    }
    System.out.println("논문 배열 : " + Arrays.toString(citations));

    // 가장 인용이 많이된 횟수
    int max = 0;
    for (int i = 0; i < citations.length; i++) {
      if (max < citations[i]) {
        max = citations[i];
      }
    }
    System.out.println("인용된 최대 횟수 : " + max);
    // 인용횟수 만큼 인용된 논문 수
    int maxCount = 0;
    for (int j = max; 0 < j; j--) {
      maxCount = 0;
      for (int i = 0; i < citations.length; i++) {
        if (max < citations[i]) {
          maxCount++;
        }
      }
      if (max <= maxCount) {
        break;
      }
      max--;
    }

    System.out.println(maxCount);



  }

}
