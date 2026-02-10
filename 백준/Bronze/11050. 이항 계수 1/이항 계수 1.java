import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 속도 업!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 이항계수 공식: N! / (K! * (N-K)!)
        System.out.println(fact(n) / (fact(k) * fact(n - k)));
    }

    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }
}
