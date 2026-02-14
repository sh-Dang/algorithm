import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static class Person{
        int age;
        String name;
        
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // input 개수
        
        Person[] arr = new Person[n];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new Person(age, name);
        }
        
        Arrays.sort(arr, (a, b) -> a.age - b.age); // table sort 문법 
        
        StringBuilder sb = new StringBuilder();
        for (Person p : arr) {
            sb.append(p.age).append(" ").append(p.name).append("\n");
        }
        
        System.out.print(sb);
    }
}