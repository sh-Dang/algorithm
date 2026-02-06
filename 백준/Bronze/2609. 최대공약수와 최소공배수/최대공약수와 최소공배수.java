import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        
        int gcd = gcd(a,b);
        int lcm = a*b /gcd;
        System.out.print(gcd+" "+lcm);
    }
    
    public static int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y, x%y);
    }
}
