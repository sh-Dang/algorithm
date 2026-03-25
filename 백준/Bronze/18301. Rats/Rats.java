import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long nn = Long.parseLong(st.nextToken());
        long nnn = Long.parseLong(st.nextToken());

        long result = ((n + 1) * (nn + 1)) / (nnn + 1) - 1;

        System.out.print(result);
    }
}