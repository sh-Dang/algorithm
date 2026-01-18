import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력값을 String으로 저장
        String s = br.readLine();
        // 다음 줄 입력값을 int로 형변환 후 저장
        int a = Integer.parseInt(br.readLine());
        
        // 배열은 0부터 시작이므로 a-1의 charAt() 메서드를 이용해 해당하는 글자 출력
        System.out.print(s.charAt(a-1));
    }
}