import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int S = Integer.parseInt(st.nextToken());// 숭
        int K = Integer.parseInt(st.nextToken());// 고
        int H = Integer.parseInt(st.nextToken());// 한
        
        if(S+K+H>=100){
            System.out.print("OK");
        }else if(Math.min(S,Math.min(K,H))==S){
            System.out.print("Soongsil");
        }else if(Math.min(S,Math.min(K,H))==K){
            System.out.print("Korea");
        }else if(Math.min(S,Math.min(K,H))==H){
            System.out.print("Hanyang");
        }
    }
}