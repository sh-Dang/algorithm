import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // readLine()은 항상 문자열 한 덩어리로 읽음 → 여러 값이면 분리 필요
    // 공백 기준으로 여러 값이 있으면 StringTokenizer 사용
        int A = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=9;i++){
                sb.append(A);
                sb.append(" * ");
                sb.append(i);
                sb.append(" = ");
                sb.append(A*i);
                sb.append("\n");
        }
        System.out.print(sb);
    }
}