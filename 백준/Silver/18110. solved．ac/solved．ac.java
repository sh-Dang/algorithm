import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 들어오는 점수의 개수
        
        // n이 0이면 0출력하고 끝내기
        if(n==0){
            System.out.print(0);
            return;
        }
        
        int exceptedValue = (int) Math.round(n*0.15); // 제거할 점수의 개수
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr); // 정렬하고
        int sum = 0;
        for(int i = exceptedValue;i<n-exceptedValue;i++){
            sum += arr[i];
        }
        
        // double로 형변환 한 최종결과를 반올림 해줘야 올바른 답이 나옴
        int result = (int) Math.round((double) sum/(n-exceptedValue*2));
        
        System.out.print(result);
    }
}