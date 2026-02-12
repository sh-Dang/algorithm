import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); // 경쟁사 가격
        int b = Integer.parseInt(st.nextToken()); // 경쟁사 성능
        int c = Integer.parseInt(st.nextToken()); // 본사 가격
        
        System.out.print(b/a*3*c);
    }
}