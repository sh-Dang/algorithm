import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Math.min(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        System.out.print(x);
    }
}