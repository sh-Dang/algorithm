import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sheet = 0;
        for(int i =0;i<n;i++){
            int x = Integer.parseInt(st.nextToken());
            sheet += x/2;
            if(x%2 ==1){
                sheet++;
            }
        }
        System.out.print(sheet);
    }
}