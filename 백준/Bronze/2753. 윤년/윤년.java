import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[])throws Exception{
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 받은 입력 int로 변환 및 메모리 할당
        int year = Integer.parseInt(br.readLine());
        
        if(year%4==0 && year%100 != 0 || year% 400 ==0){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}