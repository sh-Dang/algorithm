import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // 주어지는 수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count =0;
        int rem =0;
        
        for(int i =0;i<a;i++){
            int x = Integer.parseInt(st.nextToken());
            for(int y =1;y<=x;y++){
                if(x%y==0 && x/y >=1) rem++;
            }
            if(rem==2){
                count++;
            }
            rem = 0;
        }
        System.out.print(count);
    }
}
