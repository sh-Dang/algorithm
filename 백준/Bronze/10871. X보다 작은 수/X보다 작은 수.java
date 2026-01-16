import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다중 행 입력받는 방식 기억해 두기
public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        // 둘째 줄
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < x) {
                sb.append(a).append(" ");
            }
        }
        System.out.print(sb);
    }
}