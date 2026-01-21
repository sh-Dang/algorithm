import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        boolean asc = true;
        boolean desc = true;
        for(int i=0;i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            // 다음 숫자와 배열의 다음 수 비교(오름차순)
            if (arr[i + 1] != arr[i] + 1) {
                asc = false;
            }
            // 다음 숫자와 배열의 다음 수 비교(내림차순)
            if (arr[i + 1] != arr[i] - 1) {
                desc = false;
            }
        }
        
        if (asc) {
            System.out.print("ascending");
        } else if (desc) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}