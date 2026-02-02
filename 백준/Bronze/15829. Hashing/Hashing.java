import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod = 1234567891; // 해시값이 커지는 현상 방지를 위한 mod값
        int hash = 0;
        int r = 31; // 특정 숫자
        int pow = 1; // 거듭제곱 스태커
        
        int a = Integer.parseInt(br.readLine()); //주어진 글자 수
        String b = br.readLine();
        
        // 문자열 길이만큼 반복
        for (int i = 0; i < a; i++) {
            int c = b.charAt(i) - 'a' + 1; //a 1를 1로 만들어주는 식
            hash = (hash + c * pow) % mod;
            pow = (pow * r) % mod; // 다음 자리수용 31^i
        }

        System.out.print(hash); // 해시값 출력
    }
}