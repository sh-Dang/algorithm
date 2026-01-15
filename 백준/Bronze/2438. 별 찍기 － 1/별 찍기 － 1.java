import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        
        for(int a=1;a<=A;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* 입출력이 많아지면 StringBuilder 사용이 정석이다.
            import java.lang.StringBuilder => lang패키지 이므로 별도의 import는 불필요
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.print(sb);
        */
    }

}
