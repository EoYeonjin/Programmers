import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String score = soccer(br.readLine());
        
        System.out.print(score);
    }

    public static String soccer(String s){
        StringTokenizer st = new StringTokenizer(s);
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        if((sum+sub)%2 != 0 || (sum-sub)%2 != 0) return "-1";

        int M = (sum+sub)/2;
        int A = (sum-sub)/2;

        if(M < 0 || A < 0) return "-1";
        
        return M >= A ? M+" "+A : A+" "+M;
	}
}