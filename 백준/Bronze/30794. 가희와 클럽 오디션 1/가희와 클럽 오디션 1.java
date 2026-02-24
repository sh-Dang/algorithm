import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        
        switch(s){
            case "miss" :
                System.out.print(0);
                break;
            case "bad" :
                System.out.print(200*a);
                break;
            case "cool" :
                System.out.print(400*a);
                break;
            case "great" :
                System.out.print(600*a);
                break;
            case "perfect" :
                System.out.print(1000*a);
                break;
            default : System.out.print(0);
        }
    }
}