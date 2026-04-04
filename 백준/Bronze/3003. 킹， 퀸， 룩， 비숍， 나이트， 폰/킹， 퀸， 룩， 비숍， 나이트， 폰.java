import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());
        
        System.out.print((1 - king) + " ");
        System.out.print((1 - queen) + " ");
        System.out.print((2 - rook) + " ");
        System.out.print((2 - bishop) + " ");
        System.out.print((2 - knight) + " ");
        System.out.print(8 - pawn);
    }
}