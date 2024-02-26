package a240226.a41;
/*
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,
solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.


https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
public class main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 99) + 1;  // 1~100 길이
        char[] b = new char[a];   // 1~100 길이를 가지는 char 배열
        // 알파벳 소문자 a~z 는 아스키코드 97 ~ 122 번
        for(int i = 0; i<a ; i++){
            int c = (int) (Math.random() * 24)+97; // 97~122 랜덤 숫자 부여
            if(c==96){      // 96 나오면 32 번의 공백을 넣자
                c = 32;
            }
            b[i] = (char)c;
            }
        // String 타입으로 변환
        String s = String.valueOf(b);
         s= " tasgfwry hellqwqdod worqwtqld";
        System.out.println("받은 문자 : " + s);
        /// 시작 ////

//        String answer = "";
//        String[] strArr = s.split("");
//        int idx = 0;
//
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i].equals(" ")) {
//                idx = 1;
//            }
//
//            answer += idx % 2 == 0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
//            idx++;
//        }
//        System.out.println(answer);







        // 받은 스트링을 char 타입 배열로 변환
        char[] sChar = s.toCharArray();
        int checkIdx = 0; // 위치를 계산해서 짝수 홀수 지정할 idx
        // 새로 답을 넣을

        // 대문자를 소문자로
        for(int i = 0; i<sChar.length; i++){
            if(sChar[i] <91 && sChar[i]>64){
                sChar[i] = (char)(sChar[i] + 32);
            }
        }
        for(int i = 0; i<sChar.length; i++){
            if(sChar[i] != 32) { // 공백이 아닐경우만 변환
                if(checkIdx%2 ==0){    // 만약 위치가 짝수위치라면
                    // 대문자로 변환 = 영문자라면 -32 시키면 소문자 -> 대문자
                    sChar[i] =(char)(sChar[i] - 32) ;
                }
            }
            if (sChar[i] == 32){ // 공백이면 idx 값을 1로
                checkIdx =1;
            }
            checkIdx ++;    // idx 값을 1씩 증가시켜 홀짝반복
        }
        // 다시 String 타입으로 변환
        String answer = String.valueOf(sChar);
        System.out.println("바꾼 문자 : " + answer);
        }

    }



