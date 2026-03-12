import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken()); // 1000 사용까지 지불
        int y = Integer.parseInt(st.nextToken()); // 1000 사용이후 지불
        
        int n = Integer.parseInt(br.readLine()); // input 개수
        
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            int used = Integer.parseInt(br.readLine()); // 사용 전기량
            sb.append(used).append(' ');
            int total = 0;
            if(used<=1000){
                total = used*x;
            }else if(used>1000){
                total = (1000*x) + (used-1000)*y;
            }
            sb.append(total).append('\n');
        }
        
        System.out.print(sb);
    }
}