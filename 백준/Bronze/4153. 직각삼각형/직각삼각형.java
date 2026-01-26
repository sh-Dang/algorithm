import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 &&c==0) break;
            // abc 중 최대 값 구하기
            int max = Math.max(a,Math.max(b,c));
            int x = 0; // 각각 값 초기화
            int y = 0;
            
            if(max ==a){
                x = b;
                y = c;
            }else if(max==b){
                x = a;
                y = c;
            }else{
                x = a;
                y = b;
            }
            if((x*x)+(y*y)== (max*max)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }

    }
}