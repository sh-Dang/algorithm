import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String arr[] = new String[3];
        for(int i=0;i<3;i++){ // 세 번 반복, 숫자 찾으면 값 추론 가능
            arr[i] = br.readLine();
        }
        
        int result =0;
        
        for (int i = 0; i < 3; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                int num = Integer.parseInt(arr[i]);
                result = num + (3 - i);
                break;
            }
        }
        
        System.out.print(fizzBuzz(result));
    }
    
    private static String fizzBuzz(int a){
        if(a%3==0&&a%5==0){
            return "FizzBuzz";
        }else if(a%3==0){
            return "Fizz";
        }else if(a%5==0){
            return "Buzz";
        }else{
            return String.valueOf(a);
        }
    }
}