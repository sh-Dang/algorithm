import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        // 카운트를 담아둘 배열생성
        int[] count = new int[10];
        
        int num = a*b*c;
        // 곱한 값을 String형으로 변환
        String s = String.valueOf(num);
        
        // 나온값의 길이만큼 반복문
        for(int i=0;i<s.length();i++){
            // char에서 산술연산자가 들어가면 자동으로 int로 형변환이 일어남
            // 따라서 해당하는 숫자의 val에 count를 증가시켜 줄 수 있음
            int val = s.charAt(i) -'0';
            count[val]++;
        }
        // 0에서 9까지 돌면서 count 개수를 출력
        for(int i=0;i<=9;i++){
            System.out.println(count[i]);
        }
    }
}