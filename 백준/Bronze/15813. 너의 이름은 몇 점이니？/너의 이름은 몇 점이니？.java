import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); // 이름 길이
        String s = br.readLine(); // 이름

        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            score += c - 'A' + 1; // 대문자 점수 구하는 공식
        }

        System.out.println(score);
    }
}
