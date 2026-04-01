import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 한수의 x좌표
        int y = Integer.parseInt(st.nextToken()); // 한수의 y좌표
        int w = Integer.parseInt(st.nextToken()); // 꼭지점의 x좌표
        int h = Integer.parseInt(st.nextToken()); // 꼭짓점의 y좌표
        
        System.out.print(Math.min(x,(Math.min(y, (Math.min(w-x, h-y))))));
    }
}