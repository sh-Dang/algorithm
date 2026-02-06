import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); // 오르는 높이
        int b = Integer.parseInt(st.nextToken()); // 떨어지는 높이
        int c = Integer.parseInt(st.nextToken()); // 총 올라야 할 높이
        
        int height=0; // 현재높이
        
        // (c-b)가는데 1을 더한만큼 출력하기
        
        int day = (c-b)/(a-b);
        if((c-b)%(a-b)!=0){
            day++;
        }
        System.out.print(day);
    }
}