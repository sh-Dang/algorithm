import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        if (n == 1) {
            System.out.println(-1);
            return;
        }

        long total = (k * n) / (n - 1);
        if ((k * n) % (n - 1) != 0) {
            total++;
        }

        System.out.println(total);
    }
}
