package a240129.a30;
/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 99)+1;
        String s = "";
        char c;
        for(int i = 0; i<a; i++){
            int b = (int) (Math.random() *25 )+97;
            c = (char) b;
            s = s + c;
        }
        System.out.println("랜덤 문자열");
        System.out.println(s);

        String answer = "";
        int d = s.length()/2;
        int e = s.length()%2;
        if(e == 0){
            answer = s.substring(d-1,d+1);
        }else{
            answer = s.substring(e,e+1);
        }
        System.out.println("문자열 길이 : "+ s.length());
        System.out.println("가운데 글자");
        System.out.println(answer);
    }
}
