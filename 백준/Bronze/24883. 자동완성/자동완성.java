import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals("n")||s.equals("N")){
            System.out.print("Naver D2");
        }else{
            System.out.print("Naver Whale");
        }
    }
}