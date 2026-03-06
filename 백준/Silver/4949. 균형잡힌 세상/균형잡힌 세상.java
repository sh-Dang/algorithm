import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String sentence = br.readLine();
            if(sentence==null || sentence.equals(".")) break;
            isItBalanced(sentence);
        }        
    }
    
    // 로직 분리
    private static void isItBalanced(String s){
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='['){ // 괄호의 시작이면 stack에 적재
                stack.push(c);
            }else if(c==')'){ // 닫히는 괄호를 만나면
                if(stack.isEmpty() || stack.peek() != '('){ // 빈문자열인지 바로 앞 괄호가 '('인지 확인
                    isBalanced = false;
                    break;
                }
                stack.pop(); // 해당하는 경우(여는 해당 괄호가 있는 경우) pop();
            }else if(c==']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    isBalanced = false;
                    break;
                }
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) isBalanced=false; // 최종 예외처리
        if(isBalanced){
            System.out.println("yes");
        }else if(!isBalanced){
            System.out.println("no");
        }
    }
}