import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        // 0의 input이 오기 전까지 반복
        while(!(input=br.readLine()).equals("0")){
            System.out.println(YesOrNo(input));
        }
    }
    
    private static String YesOrNo(String s){
        // 담은 String을 비교할 Builder객체
        StringBuilder sb = new StringBuilder(s);

        if((sb.reverse().toString()).equals(s)){
            return "yes";
        }else{
            return "no";
        }
    }
}