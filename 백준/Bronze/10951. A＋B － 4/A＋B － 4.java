import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        // 범위가 정해지지 않은 반복문은 while
        /*
         * br.readLine()
         * - 한 줄을 문자열로 읽어옴
         * - 더 이상 읽을 입력이 없으면 null 반환하는 특징 이용 (EOF)
         * EOF = End Of File
         */
        while((line=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
} 