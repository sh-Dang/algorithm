import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

// **존재여부만 확인할 때는 HashSet 이분탐색 사용하기
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) set.add(Integer.parseInt(st.nextToken()));
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<m;i++){
            int x = Integer.parseInt(st.nextToken());
            sb.append(set.contains(x) ? 1 : 0).append('\n');
        }
        
        System.out.print(sb);
    }
}