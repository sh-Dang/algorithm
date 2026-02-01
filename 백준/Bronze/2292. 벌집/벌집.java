import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long a = Long.parseLong(br.readLine());
        long total = 1;
        int layer = 1;
        
        while(a>total){
            total += 6*layer;
            layer++;
        }
        // a>total 조건을 벗어나면 자동으로 반복문에서 탈출
        System.out.print(layer);
    }
}