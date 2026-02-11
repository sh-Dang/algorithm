import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int count = 0;
        int sss = 666; // 첫번째 숫자
        while(true){
            if(String.valueOf(sss).contains("666")){ // 체크하면서 카운트 늘려주기
                count++;
            }
            
            if(count == a){
                System.out.print(sss);
                break;
            }
            sss++;
        }
    }
}