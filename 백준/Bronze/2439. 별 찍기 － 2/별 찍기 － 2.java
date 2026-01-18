import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 입력값 정수에 담기
        int a = Integer.parseInt(br.readLine());
        
        // a만큼 반복 정해진만큼이므로 for 문
        for(int i=1;i<=a;i++){
            // 무엇을? (1개 ~ a개 까지 별을 찍고 줄바꿈 하는 행위를)
            for(int j=1;j<=a-i;j++){
                sb.append(" ");
            }
            for(int k=1;k<=i;k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}