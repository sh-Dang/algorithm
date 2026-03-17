import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 26 알파벳이 담긴 배열에 count를 ++하면서 넣고
        // 각각 count 가 일치하면 possible, 일치하지 않으면 impossible
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();
            
            if(first.length() != second.length()){
                System.out.println("Impossible");
                continue;
            }
            
            int[] count = new int[26]; // 각각 알파벳 할당
            
            // 첫번째 문자열
            for(int j=0;j<first.length();j++){
                count[first.charAt(j) - 'a']++; //해당하는 위치 찾아서 count 더해줌
            }
            
            // 두번째 문자열
            for(int k=0;k<second.length();k++){
                count[second.charAt(k) - 'a']--; //해당하는 위치 찾아서 count 감소
            }

            boolean isSame = true;
            for(int l=0;l<26;l++){
                if(count[l] != 0){
                    isSame = false;
                    break;
                }
            }
            System.out.println(isSame ? "Possible" : "Impossible");
        }
    }
}