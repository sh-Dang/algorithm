import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        if(br.readLine().equals(br.readLine())) System.out.print(0);
        else System.out.print(1550);
    }
}