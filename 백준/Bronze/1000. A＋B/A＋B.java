import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 백준에서는 반드시 Main 클래스여야 채점이 된다
public class Main{
    // 입력 처리 중 발생할 수 있는 Exception을 잡아준다.
    public static void main(String args[])throws IOException{
        // 표준 입력(System.in)을 빠르게 읽기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 한 줄 입력을 읽고, 공백 기준으로 토큰(단어) 단위로 나누기
        // ex) "3 5" -> ["3", "5"]
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 첫번째 토큰을 정수로 변환 -> A
        int A = Integer.parseInt(st.nextToken());
        // 두번째 토큰을 정수로 변환 -> B
        int B = Integer.parseInt(st.nextToken());
        
        // 두 정수의 합을 출력
        System.out.print(A+B);
    }
}
