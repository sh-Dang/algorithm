import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fourth = 0;
        for(int i=0;i<4;i++){
            int x = Integer.parseInt(br.readLine());
            fourth += x;
        }
        String result = (fourth<=1500) ? "Yes" : "No";
        System.out.print(result);
    }
}