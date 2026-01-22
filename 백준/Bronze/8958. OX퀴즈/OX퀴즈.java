import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 케이스 수
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            
            // O 개수 카운트
            int count = 0;
            // 총 점수
            int sum = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else { // X인 경우
                    count = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb.toString());
    }
}
