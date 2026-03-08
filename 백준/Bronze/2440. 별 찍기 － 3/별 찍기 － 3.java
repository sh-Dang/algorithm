import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { // 출력 후
                sb.append("*");
            }
            sb.append("\n"); // 줄 바꿈
        }
        System.out.print(sb);
    }
}