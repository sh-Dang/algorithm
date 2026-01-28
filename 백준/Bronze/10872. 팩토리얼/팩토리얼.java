import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int result =1; // 0! = 1 설정
        for(int i=1;i<=a;i++){
            result *= i;
        }
        
        System.out.print(result);

    }
}