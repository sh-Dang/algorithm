import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean isJackPot = true;

        for (int i = 0; i < 3; i++) { // 각 줄 검사
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean hasSeven = false;
            
            for (int j = 0; j < n; j++) { // n개의 숫자확인
                if (Integer.parseInt(st.nextToken()) == 7) {
                    hasSeven = true;
                }
            }
            if (!hasSeven) {
                isJackPot = false;
            }
        }

        if (isJackPot) {
            System.out.println("777");
        } else {
            System.out.println("0");
        }
    }
}
