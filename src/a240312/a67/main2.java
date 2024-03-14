package a240312.a67;

public class main2 {

    public static void main(String[] args) {

        String answer = "";
        // 문자열 s  5 ~ 50 길이
        int sLength = (int) (Math.random() * 46) + 5;
        char[] sChar = new char[sLength];
        for (int i = 0; i < sChar.length; i++) {
            int c = (int) (Math.random() * 26) + 97; // 97~122 랜덤 숫자 부여 (알파벳 소문자)
            sChar[i] = (char) c;
        }
        String s = String.valueOf(sChar);
        System.out.println("주어진 문자열 : " + s);

        // 문자열 skip 1 ~ 10 길이
        int skipLength = (int) (Math.random() * 10) + 1;
        char[] skipChar = new char[skipLength];
        for (int i = 0; i < skipChar.length; i++) {
            int c = (int) (Math.random() * 26) + 97; // 97~122 랜덤 숫자 부여 (알파벳 소문자)
            skipChar[i] = (char) c;
        }
        String skip = String.valueOf(skipChar);
        System.out.println("암호화 건너뛸 문자열 : " + skip);

        // 암호화 인덱스 1 ~ 20
        int index = (int) (Math.random() * 20) + 1;
        System.out.println("암호화 인덱스 : " + index);



        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }

        System.out.println(answer);

    }

}
