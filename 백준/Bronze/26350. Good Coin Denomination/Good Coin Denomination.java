import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            int[] arr = new int[x];
            for(int j = 0; j < x; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            boolean good = true;
            for(int j = 1; j < x; j++){
                if(arr[j] < arr[j-1] * 2){
                    good = false;
                    break;
                }
            }

            sb.append("Denominations:");
            for(int v : arr) sb.append(" ").append(v);
            sb.append('\n');

            if(good) sb.append("Good coin denominations!");
            else sb.append("Bad coin denominations!");
            sb.append('\n');
            sb.append('\n');

        }
        System.out.print(sb);
    }
}