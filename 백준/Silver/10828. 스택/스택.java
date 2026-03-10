import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 총 input수
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch(cmd){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x); break;
                case "pop":
                    if(stack.size()==0){
                        System.out.println(-1); break;
                    }else{
                        System.out.println(stack.pop()); break;
                    }
                case "size":
                    System.out.println(stack.size()); break;
                case "empty":
                    if(stack.isEmpty()){
                        System.out.println(1); break;
                    }else{
                        System.out.println(0); break;
                    }
                case "top":
                    if(stack.size()==0){
                        System.out.println(-1); break;
                    }else{
                        System.out.println(stack.peek()); break;
                    }
            }
        }
    }
}