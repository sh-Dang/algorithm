import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String a = br.readLine();
        
        int result = 0;
        // 문자열의 각 문자를 순회하면서 숫자로 변환 후 누적 합 계산
        for (int i = 0; i < length; i++) {
            // char → int 변환
            // '0'을 빼면 실제 숫자 값이 됨
            result += a.charAt(i) - '0';
        }
        System.out.print(result);
    }
}