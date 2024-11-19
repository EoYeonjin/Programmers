import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(hangul(br.readLine()));
    }

    public static int hangul(String s){
        int diff = s.charAt(0) - 0xAC00;

        int inital = diff/(21*28);
        diff %= (21*28);

        int medial = diff/28;
        int fin = diff % 28;

        int result = (inital*21*28) + (medial*28) + fin + 1;

        return result;
    }
}