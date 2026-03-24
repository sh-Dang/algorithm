import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        
        while(!queue.isEmpty()){
            for(int i=1;i<k;i++){
                queue.offer(queue.poll());
            }
            if(queue.size()!=1){
                sb.append(queue.poll()).append(", ");    
            }else{
                sb.append(queue.poll()).append('>');
            }  
        }
        
        System.out.print(sb);
    }
}
