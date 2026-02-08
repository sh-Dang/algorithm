import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int sum = 0; // 총 합을 담을 변수
        int starIndex = 0; // *이 어디 들어있는지 파악        

        for (int i = 0; i < 13; i++) { // * 위치찾고 나머지 숫자들의 가중치 합 구하기
            char c = s.charAt(i);
            
            if (c == '*') { // *일 경우 위치만 저장하고 연산을 수행하지 않음
                starIndex = i;
                continue;
            }
            
            int num = c - '0'; // 실제 숫자 구하기
            sum += (i % 2 == 0) ? num : (num * 3);
        }

        // 0~9 중에서 조건 만족하는 값 찾기
        int value = (starIndex % 2 == 0) ? 1 : 3;
        for (int i = 0; i <= 9; i++) {
            if ((sum + (i * value)) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
