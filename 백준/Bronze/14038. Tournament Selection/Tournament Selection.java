import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;

        for(int i=0;i<6;i++){
            String winLose = br.readLine();
            if(winLose.equals("W")) {
                count++; 
            }
        }
        
        int group =0;
        if(count >= 5){
            group = 1;
        }else if(count >= 3){
            group = 2;
        }else if(count >= 1){
            group = 3;
        }else{
            group = -1;
        }
        System.out.print(group);
    }
}