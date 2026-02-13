import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        int count = 0;

        while (a > 1) {
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a += 1;
            }
            count++;
        }

        System.out.println(count);
    }
}
