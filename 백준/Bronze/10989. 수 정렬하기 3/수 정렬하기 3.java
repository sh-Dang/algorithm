import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // 들어오는 Input
        int[] array = new int[a];
        for(int i =0;i<array.length;i++){
            int x = Integer.parseInt(br.readLine());
            array[i] = x;
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<array.length;i++){ // a의 수만큼 반복
            sb.append(array[i]).append("\n");
            if (sb.length() > 10000) {
                System.out.print(sb);
                sb.setLength(0);
            }
        }
        System.out.print(sb);
    }
}