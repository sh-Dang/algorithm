import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        // list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < a; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append('\n');
        }

        System.out.print(sb);
    }
}
