import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ds = Integer.parseInt(st.nextToken()); // 태양이 현재위치에 오기까지 걸린시간
        int dy = Integer.parseInt(st.nextToken()); // 태양 회전주기
        
        st = new StringTokenizer(br.readLine());
        int ms = Integer.parseInt(st.nextToken()); // 달 걸린시간
        int my = Integer.parseInt(st.nextToken()); // 달 회전주기
        
        int count = 1; // 1년이 지난후부터 count
        while(true){
            if((count+ds)%dy==0 && (count+ms)%my==0){ // 둘다 맞아떨어질때
                System.out.print(count); // x의 값 출력
                break;
            }
            count++;
        }
    }
}