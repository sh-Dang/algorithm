import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        // 시간
        int a = Integer.parseInt(st.nextToken());
        // 분
        int b = Integer.parseInt(st.nextToken());
        
        if(b<45){
            a = a -1;
            b = b+ 60- 45;
            if(a == -1){
                a = 23;
            }
        }else{
            a = a;
            b = b-45;
        }
        
        sb.append(a).append(" ").append(b);
        System.out.print(sb);
    }
}