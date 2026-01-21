import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 반복문 돌릴 입력값 받기 첫째 줄
        int n = Integer.parseInt(br.readLine());
        // 숫자 담을 배열 생성
        int[] nums = new int[n];
        
        // 둘째 줄
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        
        /* 내부 로직 직접 구현 버전
        int max = nums[0];
        int min = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        */
        
        // 출력할 StringBuilder
        sb.append(min).append(" ").append(max);
        // 결과 출력
        System.out.print(sb);
    }

}
