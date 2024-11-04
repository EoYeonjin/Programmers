import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();

        char A = N.charAt(0);
        char B = N.charAt(1);

        if(A == B) sb.append(1);
        else sb.append(0);
        
        System.out.print(sb);
	}
}