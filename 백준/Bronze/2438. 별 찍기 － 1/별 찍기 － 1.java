import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        
        for(int a=1;a<=A;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}