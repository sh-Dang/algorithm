import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        if(N==1 || M==1){
            System.out.print(0);
            return;
        }
        int result = (N-1)*(M-1)*2;
        System.out.print(result);
    }
}