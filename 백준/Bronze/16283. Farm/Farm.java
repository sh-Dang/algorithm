import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 양 한마리가 먹는 사료
        int b = Integer.parseInt(st.nextToken()); // 염소 한마리가 먹는 사료
        int n = Integer.parseInt(st.nextToken()); // 양과 염소 전체 수
        int w = Integer.parseInt(st.nextToken()); // 소비한 사료 수
        // a*x + b*y = w
        // x + y = n
        int goat =0;
        int sheep =0;
        int count =0; // 답의 수
        for(int x =1;x<n;x++){ // 양의 수 대입해 가면서
            int y = n - x; // 염소의 수
            if(x*a + b*y == w){
                count++;
                goat = x;
                sheep = y;
            }
        }
        if(count==1){
            System.out.print(goat+" "+sheep);    
        }else{
            System.out.print(-1);
        }
        
        
    }
}