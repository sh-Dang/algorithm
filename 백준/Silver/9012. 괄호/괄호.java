import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                
                if(c=='('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        check = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            
            if(!stack.isEmpty()) check = false;
            
            if(check){
                sb.append("YES").append('\n');
            }else{
                sb.append("NO").append('\n');
            }
        }
        
        System.out.print(sb);
    }
}