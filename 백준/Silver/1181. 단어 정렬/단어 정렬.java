import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        // 중복 제거용 Set
        Set<String> input = new HashSet<>();
        
        for (int i = 0; i < a; i++) {
            input.add(br.readLine()); // 존재하지 않는 값에 대해서만 add됨
        }

        // 정렬을 위한 list형으로 변환
        List<String> list = new ArrayList<>(input);
        
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) { // 양수면 b가 앞으로, 음수면 a가 앞으로 오도록 정렬해주는 메서드
                if (a.length() != b.length()) {
                    return a.length() - b.length(); // 길이 오름차순
                }
                return a.compareTo(b); // 사전순
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s : list){ // list의 수만큼 반복
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}