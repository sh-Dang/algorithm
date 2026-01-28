import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 각각 a개의 줄에 b개의 원소
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[][] arrX = new int[a][b];
        int[][] arrY = new int[a][b];
        // X배열에 담기
        for(int i = 0;i < a;i++){
            // a개수 만큼 반복
            st = new StringTokenizer(br.readLine());
            
            for(int j =0;j < b;j++){
                arrX[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // Y배열에 담기
        for(int i = 0;i < a;i++){
            // a개수 만큼 반복
            st = new StringTokenizer(br.readLine());
            
            for(int j =0;j < b;j++){
                arrY[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        // 두 배열 더하기
        for(int i = 0;i < a;i++){
            for(int j = 0;j < b;j++){
                sb.append(arrX[i][j] + arrY[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}