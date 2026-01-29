import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        
        if (score.equals("A+")) {
            System.out.print("4.3");
        } else if (score.equals("A0")) {
            System.out.print("4.0");
        } else if (score.equals("A-")) {
            System.out.print("3.7");
        } else if (score.equals("B+")) {
            System.out.print("3.3");
        } else if (score.equals("B0")) {
            System.out.print("3.0");
        } else if (score.equals("B-")) {
            System.out.print("2.7");
        } else if (score.equals("C+")) {
            System.out.print("2.3");
        } else if (score.equals("C0")) {
            System.out.print("2.0");
        } else if (score.equals("C-")) {
            System.out.print("1.7");
        } else if (score.equals("D+")) {
            System.out.print("1.3");
        } else if (score.equals("D0")) {
            System.out.print("1.0");
        } else if (score.equals("D-")) {
            System.out.print("0.7");
        } else {
            System.out.print("0.0");
        }

    }
}