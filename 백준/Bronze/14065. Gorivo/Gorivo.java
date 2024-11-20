import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.printf("%.6f", gorivo(Double.parseDouble(br.readLine())));
    }

    public static double gorivo(double gorivo){
        return (3.785411784*100)/(gorivo*1.609344);
    }
}