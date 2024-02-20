package a240220.a36;
/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

https://school.programmers.co.kr/learn/courses/30/lessons/12918?language=java
 */
public class main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 7) + 1;  // 1~8 길이
        char[] b = new char[a];   // 1~8 길이를 가지는 char 배열
        for(int i = 0; i<a ; i++){
            int c = (int) (Math.random() * 34)+1; // 1~35 랜덤 숫자 부여
            if(c < 10){         //만약 1~9 면
                c = c + 48;     // 아스키 코드상 49~57 이 1~9
                b[i] = (char) c; // 숫자 대입
            }else{      // 10~35면
                c = c + 87; // 아스키 코드상 97~122 가 a~z
                b[i] = (char) c;
            }
        }
        String s = String.valueOf(b);
        System.out.println("자릿수 : " + a);
        System.out.println("랜덤 문자 배열 : " + s );
        char[] sChar = s.toCharArray();
        boolean answer = false;

        if(s.length() == 4 || s.length()==6){
            try{
                Integer.parseInt(s);
                answer = true;
            } catch (NumberFormatException ex){
                answer = false;
            }
        }else {
            answer = false;
        }
        System.out.println("해당 문자는 4 혹은 6 사이즈의 숫자로만 이루어져 있는가? : " + answer);


    }

}
