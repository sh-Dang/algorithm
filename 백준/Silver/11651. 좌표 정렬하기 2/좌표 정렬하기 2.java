import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y; // 한번에 넣어줘도 됨
        }
        
        Arrays.sort(arr, (a,b)->{
            if(a[1]==b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<n;i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}