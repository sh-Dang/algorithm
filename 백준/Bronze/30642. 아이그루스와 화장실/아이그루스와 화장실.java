import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 동아리방 층 수
        String mName = br.readLine(); // 마스코트
        int mFloor = Integer.parseInt(br.readLine()); // 마스코트 층 수
        
        if(mName.equals("annyong")){ // 아녕이인 경우(홀수)
            if(mFloor%2==0){
                System.out.print(mFloor-1);
            }else if(mFloor%2==1){
                System.out.print(mFloor);
            }
        }else if(mName.equals("induck")){// 인덕이인 경우(짝수)
            if(mFloor%2==0){
                System.out.print(mFloor);
            }else if(mFloor%2==1 && mFloor != 1){ // 1층에 있는경우 +1 해주야되네
                System.out.print(mFloor-1);
            }else{
                System.out.print(2);
            }
        }
    }
}