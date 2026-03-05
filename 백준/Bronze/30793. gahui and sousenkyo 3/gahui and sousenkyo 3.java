import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // **(double)로 형변환 해주지 않을 경우 a/b(정수연산) 먼저 실행 후 double 자료형에 담기므로 0이 담겨 오답
        double result = (double)a/b;
        if(result<0.2){
            System.out.print("weak");
        }else if(result<0.4){
            System.out.print("normal");
        }else if(result<0.6){
            System.out.print("strong");
        }else{
            System.out.print("very strong");
        }
        
    }

}
