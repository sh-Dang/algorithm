import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] check = new boolean[42]; // 나머지 0~41 체크

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int r = n % 42;
            check[r] = true; // 해당 나머지 존재 표시
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (check[i]) count++;
        }
        System.out.print(count);
    }
}