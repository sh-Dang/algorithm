import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 교실을 예약할 수 있는 교시의 개수
        int X = Integer.parseInt(st.nextToken()); // 건우가 예약한 교시

        int N = Integer.parseInt(br.readLine()); // 조원의 수
        for(int i =0;i<N;i++){
            boolean flag = false;
            int K = Integer.parseInt(br.readLine()); // 각 조원이 예약할 수 있는 교시의 수
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<K;j++){
                int a = Integer.parseInt(st.nextToken());
                if(a == X){
                    flag = true;
                    continue;
                }
            }
            if(!flag){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}