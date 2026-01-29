import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 참가자 수
        
        int total=0; // 출력할 첫 번째 줄 값
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] perSize = new int[6];
        
        for(int i=0;i<perSize.length;i++){
            perSize[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());// 티셔츠, 펜 묶음당 개수
        int shirts = Integer.parseInt(st.nextToken()); // 티셔츠
        int pens = Integer.parseInt(st.nextToken()); // 펜
        
        // 반복문 돌면서 몫 + 1;
        for(int i=0;i<perSize.length;i++){
            total += (perSize[i] + shirts - 1)/shirts;
        }

        
        // 출력 StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(total).append("\n");// 첫 번째 줄
        sb.append(n/pens).append(" ").append(n%pens); // 두 번째 줄
        
        System.out.print(sb);
    }
}