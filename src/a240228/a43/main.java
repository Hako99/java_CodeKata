package a240228.a43;
/*
문제 설명
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우,
t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

제한사항
1 ≤ p의 길이 ≤ 18
p의 길이 ≤ t의 길이 ≤ 10,000
t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
 */

public class main {
    public static void main(String[] args) {
        int lengthP = (int) (Math.random() * 17) + 1;  // 1~18
        int lengthT = (int) (Math.random() * (10000-lengthP)) + lengthP;  // lengthP ~ 10000

        String p = String.valueOf((int)(Math.random() * 9));
        for(int i = 1; i<lengthP;i++){
            p = p + (int)(Math.random() * 9); // 각 자리수마다 0~9 넣기
        }
        System.out.println(lengthP + " 자릿수 p ");
        System.out.println(p);

        String t = String.valueOf((int)(Math.random() * 9));
        for(int i = 1; i<lengthT;i++){
            t = t + (int)(Math.random() * 9); // 각 자리수마다 0~9 넣기
        }
        System.out.println(lengthT + " 자릿수 t ");
        System.out.println(t);

        //
        long numberP = Long.parseLong(p);
        int count =0;
        for (int i = 0; i < t.length() - lengthP +1 ; i++){
            long a = Long.parseLong(t.substring(i,i+lengthP));
            if(a <= numberP){
                count++;
            }
        }
        System.out.println(count);



    }

}
