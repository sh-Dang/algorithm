import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] pos = new int[26];

        // 전부 -1로 초기화
        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        // 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            // 아직 기록 안 된 경우만 저장 (처음 위치만 필요)
            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(pos[i]).append(" ");
        }
        System.out.print(sb.toString());
    }
}
