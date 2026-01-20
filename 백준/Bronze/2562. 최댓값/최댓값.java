import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값에 음수 등이 포함되는 경우
        // 0으로 설정하는 것은 문제가 발생할 수 있으므로 Integer.MIN_VALUE를 사용하기
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
