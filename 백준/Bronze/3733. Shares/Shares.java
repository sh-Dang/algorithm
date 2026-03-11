import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            
            int x = s / (n + 1);
            
            System.out.println(x);
        }
    }
}