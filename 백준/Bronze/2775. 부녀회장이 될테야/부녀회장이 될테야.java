import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine()); // 총 들어오는 input
        int[][] apt = new int[15][15];
        
        for(int i =0;i<15;i++){ // 0층에 값 할당
            apt[0][i] = i;
        }
        
        for(int i =1;i<15;i++){ // 0층에 값이 들어가면 안되니 1부터
            for(int j = 1;j<15;j++){
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (a-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apt[k][n]).append('\n');
        }
        System.out.println(sb);
    }
}