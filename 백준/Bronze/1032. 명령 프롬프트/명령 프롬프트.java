import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] result = br.readLine().toCharArray(); // char 배열은 String으로 들어간다.

        for (int i = 1; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < result.length; j++) {
                if (result[j] != s.charAt(j)) {
                    result[j] = '?';
                }
            }
        }
        System.out.println(result);
    }
}