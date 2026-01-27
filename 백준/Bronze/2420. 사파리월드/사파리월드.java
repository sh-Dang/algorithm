import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)이므로 long형 int형은(2,-,- 까지)
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        // 절대값 출력
        System.out.println(Math.abs(a-b));
    }
}