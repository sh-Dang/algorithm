import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine()); // 들어올 Input 개수
        StringBuilder sb = new StringBuilder();
        
        int[][] body = new int[a][2];
        for(int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()); // 몸무게
            int height = Integer.parseInt(st.nextToken()); // 키
            body[i][0] = weight; // 00에 몸무게, 10, 20
            body[i][1] = height; // 01에 키, 11, 21
        }
        for(int j=0;j<a;j++){
            int rank = 1;
            for(int k=0;k<a;k++){
                if(body[j][0] < body[k][0] && body[j][1] <body[k][1]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.print(sb);
    }
}