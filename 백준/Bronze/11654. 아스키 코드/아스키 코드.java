import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char a = br.readLine().charAt(0);
        // char를 int로 형변환하면 해당 문자의 ASCII 코드 값이 출력됨
        int b = (int) a;
        System.out.print(b);
    }

}
