import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); // 편도 운행에 소요되는 시간
        int b = Integer.parseInt(st.nextToken()); // 제 2 공학관에 도착하는데 걸리는 시간
        // 민준이는 서울대입구역에 있음
        
        if(b>a){
            System.out.print(b-a);
        }else{
            System.out.print(a+b);
        }
    }
}