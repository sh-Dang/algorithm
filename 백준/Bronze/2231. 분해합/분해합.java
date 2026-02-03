import java.io.BufferedReader;
import java.io.InputStreamReader;

// 생성자들을 구하고 나서 그중에 min() 하면 될듯

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // 주어진 분해합
        
        int answer = 0; // 주어진 값 초기화
        for (int i = 1; i < a; i++) {
            int sum = i;
            int temp = i;

            // 자리수 합 계산
            while (temp > 0) {
                sum += temp % 10; // 10씩 나눈 나머지를 더하는 과정을 반복하여 sum에 추가
                temp /= 10;
            }

            if (sum == a) {
                answer = i;
                break; // 가장 작은 생성자이므로 즉시 종료
            }
        }

        System.out.println(answer);
    }
}