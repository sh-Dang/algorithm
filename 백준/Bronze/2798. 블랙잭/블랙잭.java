import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 주어지는 수의 개수
        int b = Integer.parseInt(st.nextToken()); // 목표 숫자

        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0; // 최대값
        for (int i = 0; i < a - 2; i++) {
            for (int j = i + 1; j < a - 1; j++) {
                for (int k = j + 1; k < a; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= b) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
