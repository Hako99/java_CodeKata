package a240308.a68;
/*
문제 설명
햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면
조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고,
상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

예를 들어, 상수의 앞에 쌓이는 재료의 순서가
[야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고,
아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
 즉, 2개의 햄버거를 포장하게 됩니다.

상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

제한사항
1 ≤ ingredient의 길이 ≤ 1,000,000
ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
 */

import java.util.Arrays;
import java.util.Stack;

public class main {

    public static void main(String[] args) {
        // 재료 목록 ingredient 의 길이 1 ~1000000
        int ingredientLength = (int) (Math.random() * 1000000) + 1;
        // 재료가 담기는 배열 ingredient
        int[] ingredient = new int[ingredientLength];
        for (int i = 0; i < ingredient.length; i++) {
            // 재료는 1: 빵 , 2 : 야채 , 3 : 고기 이다.
            ingredient[i] = (int) (Math.random() * 3) + 1;
        }
        System.out.println("받은 재료들");
        System.out.println(Arrays.toString(ingredient));

        // 햄버거 만들고 나머지 재료들을 담을 스택
        Stack<Integer> ingredientList = new Stack<>();
        // 만들 수 있는 햄버거 카운터
        int count = 0;

        for (int i : ingredient) {
            ingredientList.push(i);

            // 4개 이상재료 쌓이면 햄버거 만들수 있나 체크
            if (ingredientList.size() >= 4) {

                // 재료가 1234 면
                if (ingredientList.get(ingredientList.size() - 4) == 1  // 마지막에서 4번째 위치가 1 (빵)
                    && ingredientList.get(ingredientList.size() - 3) == 2  // 마지막에서 3번째 위치가 2 (야채)
                    && ingredientList.get(ingredientList.size() - 2) == 3  // 마지막에서 2번째 위치가 3 (고기)
                    && ingredientList.get(ingredientList.size() - 1)
                    == 1) {  // 마지막에서 1번째 위치가 1 (빵) 이면

                    count++;
                    ingredientList.pop();
                    ingredientList.pop();
                    ingredientList.pop();
                    ingredientList.pop();   // 마지막으로 들어왔던 4개 제거
                }
            }

        }
        System.out.println("만들 수 있는 햄버거 갯수 : " + count);
    }

}
