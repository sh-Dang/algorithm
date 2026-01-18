import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        
        // 정수일 때
        System.out.println(a+b-c);
        // 문자열 일 때
        System.out.print(Integer.parseInt(A+B) - c);
    }
}