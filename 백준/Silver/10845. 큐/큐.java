import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 토큰화
        int n = Integer.parseInt(st.nextToken());
        
        Deque<Integer> queue = new ArrayDeque<>(); // 큐 자료형
        
        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken(); 
            if(input.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                queue.offer(x); // boolean값 반환
                // System.out.println(x); // push는 출력하지 않는다 문제 잘 읽기
            }else if(input.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.poll());
                }
            }else if(input.equals("size")){
                System.out.println(queue.size());
            }else if(input.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
            }else if(input.equals("front")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.peek());
                }
            }else if(input.equals("back")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.peekLast());
                }
            }
        }
    }
}