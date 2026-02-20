import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // input 개수
        
        int[][] arr = new int[n][2];
        
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // x좌표
            int y = Integer.parseInt(st.nextToken()); // y좌표
            arr[i][0] = x;
            arr[i][1] = y; // 담기
        }
        
        Arrays.sort(arr, (a,b)->{
            if(a[0]==b[0]) return a[1] - b[1]; // Comparer가 음수반환 시 유지, 양수 반환시 바꿔주는 로직
            return a[0] - b[0];
        });
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<n;i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}