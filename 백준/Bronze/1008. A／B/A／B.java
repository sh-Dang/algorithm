import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄을 읽어 공백 기준으로 분리하고, 토큰을 순차적으로 꺼낼 수 있는 객체 생성
        StringTokenizer st = new StringTokenizer(br.readLine());

        // nextToken() 호출 시마다 내부 위치가 이동하며 다음 토큰을 반환
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.print((double)A/B);
    }
}