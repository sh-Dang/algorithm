import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 째 줄(입력 개수)
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            // 둘째+ 줄 층수, 방수, 손님순서
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken()); // 층 수
            st.nextToken(); // 방 수(사용 안함)
            int guestNum = Integer.parseInt(st.nextToken()); // 손님 순서
            
            int floor = (guestNum - 1) % w + 1; // w 예외처리 필요없는 로직
            
            int roomNum = (guestNum-1)/w +1; // 호는 몫
            
            StringBuilder sb = new StringBuilder();
            if(roomNum<10){
                sb.append(floor).append("0").append(roomNum);
            }else{
                sb.append(floor).append(roomNum);
            }
            System.out.println(sb);
        }        
    }
}