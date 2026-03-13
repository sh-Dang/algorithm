import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>(); // key, value로 저장하는 HashMap사용
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num,0)+1); // 각각 숫자(key)와 숫자의 수(value 넣기)
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num,0)).append(" "); // key값 조회후 불러오기
        }
        System.out.print(sb);
    }
}