import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); // division1
        int b = Integer.parseInt(st.nextToken()); // division2
        int c = Integer.parseInt(st.nextToken()); // shake!
         
        if(a+c>=b){
            System.out.print(a+c);
        }else{
            System.out.print(b);
        }
    }
}