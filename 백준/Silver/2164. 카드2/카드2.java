import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        
        // 1번부터 N번까지 카드 삽입
        for (int i = 1; i <= n; i++) {
            queue.offer(i);   // offer() : 뒤에 삽입
        }

        while (queue.size() > 1) { // 큐 내부에 자료가 1개 남을때까지 반복
            queue.poll();                // 맨 앞 제거, 반환값은 지워진 값
            queue.offer(queue.poll());   // 다음 카드 뒤로 이동(지워진 값을 맨 뒤에 삽입하는 로직)
        }

        System.out.println(queue.poll()); // 남은 한 개 출력
    }
}