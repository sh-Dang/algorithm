import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            double height = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            
            if(height<140.1){
                System.out.println(6);
            }else if(height<146){
                System.out.println(5);
            }else if(height<159){
                System.out.println(4);
            }else if(height<161){ // BMI
                double bmi = weight/((height/100)*(height/100));
                if(bmi<16 || bmi>=35){ // 3, 4급
                    System.out.println(4);    
                }else{
                    System.out.println(3);    
                }
            }else if(height<204){ // BMI
                double bmi = weight/((height/100)*(height/100));
                if(bmi>=20 && bmi<25){ // 1, 2, 3, 4급
                    System.out.println(1);    
                }else if((bmi>=18.5 && bmi<20) || (bmi>=25 && bmi<30)){
                    System.out.println(2);    
                }else if((bmi>=16 && bmi<18.5) || (bmi>=30 && bmi<35)){
                    System.out.println(3);    
                }else if(bmi<16 || bmi>=35){
                    System.out.println(4);    
                }
            }else if(height>=204){
                System.out.println(4);
            }
        }
    }
}