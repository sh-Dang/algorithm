import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 5 나누고 나머지 3으로 나눠지면,
        // 5로도 안떨어지고 3으로도 안떨어지면 -1
        if(n%5==0){
            System.out.print(n/5);
        }else if(n==4 || n ==7){
            System.out.print(-1);
        }else if(n%5==1 || n%5==3){
            System.out.print((n/5)+1);
        }else if(n%5==2 || n%5==4){
            System.out.print((n/5)+2);
        }
    }
}