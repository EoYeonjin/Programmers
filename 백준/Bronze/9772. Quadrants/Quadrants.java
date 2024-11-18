import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            
            sb.append(quadrants(a, b)).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String quadrants(double a, double b){
        if(a == 0 || b == 0) return "AXIS";
        else if(a > 0 && b > 0) return "Q1";
        else if(a < 0 && b > 0) return "Q2";
        else if(a < 0 && b < 0) return "Q3";
        else return "Q4";
    }
}