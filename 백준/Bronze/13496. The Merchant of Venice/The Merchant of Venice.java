import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(br.readLine()); // DataSet 개수
        
        for (int i = 1; i <= a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken()); // 안토니오가 보유한 배
            int y = Integer.parseInt(st.nextToken()); // 배가 하루에 항해할 수 있는 거리
            int z = Integer.parseInt(st.nextToken()); // 남은 기한
            
            int result = 0; // 기한 내에 도착 가능한 배들의 금 합
            
            for (int j = 0; j < x; j++) {
                st = new StringTokenizer(br.readLine());
                int d = Integer.parseInt(st.nextToken()); // 베니스까지 남은 거리
                int v = Integer.parseInt(st.nextToken()); // 각 배의 금의 양
                
                if (y * z >= d) { // 도착 가능하면.
                    result += v;
                }
            }
            
            // 출력 형식 맞추기
            sb.append("Data Set ").append(i).append(":\n");
            sb.append(result).append("\n\n");
        }
        System.out.print(sb);
    }
}
