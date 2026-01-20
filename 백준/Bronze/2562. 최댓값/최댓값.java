import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
    
        // 9개 주어짐
        for (int i = 1; i <= 9; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > max) {
                max = value;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}