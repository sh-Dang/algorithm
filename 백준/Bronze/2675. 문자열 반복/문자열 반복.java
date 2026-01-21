import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄
        int n = Integer.parseInt(br.readLine());
        
        // 총 입력받을 줄(n)만큼 반복
        for(int i=1;i<=n;i++){
            // 출력 할 StringBuilder()
            StringBuilder sb = new StringBuilder();
            
            // 둘째 줄
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            // 첫 정수 만큼 반복할 횟수 지정
            int a = Integer.parseInt(st.nextToken());
            
            // 입력받은 문자열
            String s = st.nextToken();
            
            // 문자열의 길이만큼 반복
            for(int j=0;j<s.length();j++){
                // 문자를 a만큼 반복해서 찍어내기
                for(int k=0;k<a;k++){
                    sb.append(s.charAt(j));
                }
            }
            System.out.println(sb);
        }
        
    }
}