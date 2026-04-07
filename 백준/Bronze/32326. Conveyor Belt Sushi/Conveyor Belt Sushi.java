import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dollar3 = Integer.parseInt(br.readLine());
        int dollar4 = Integer.parseInt(br.readLine());
        int dollar5 = Integer.parseInt(br.readLine());
        
        System.out.print((dollar3*3)+(dollar4*4)+(dollar5*5));
    }
}