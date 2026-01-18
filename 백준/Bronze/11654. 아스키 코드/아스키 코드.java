import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char a = br.readLine().charAt(0);
        int b = (int) a;
        System.out.print(b);
    }
}