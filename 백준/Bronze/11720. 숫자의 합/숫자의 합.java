import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;

        for (int i=0; i<N; i++) {
            int c = Character.getNumericValue(s.charAt(i));
            result += c;
        }
        System.out.print(result);
    }
}