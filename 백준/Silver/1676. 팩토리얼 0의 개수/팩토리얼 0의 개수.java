import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        for(int i = 5;i<=a;i*=5){
            count += a/i;
        };
        System.out.print(count);
    }
}