import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int result = 0;

        for (int i=0; i<N; i++) {
            char c = S.charAt(i);
            if(c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') result++;
        }
        sb.append(result);
            
        System.out.print(sb);
	}
}