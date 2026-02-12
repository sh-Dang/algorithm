import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int result=1;
        for(int i=1;i<=a;i++){
            result *= 2;
        }
        System.out.print(result);
    }
}