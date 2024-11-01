import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int year = Integer.parseInt(br.readLine());

        sb.append("A");
        
        System.out.print(sb);
	}
}