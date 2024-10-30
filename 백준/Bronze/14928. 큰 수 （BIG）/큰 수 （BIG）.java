import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        long modValue = 20000303;
        long remainder = 0;

        for (char digit : input.toCharArray()) {
            remainder = (remainder * 10 + (digit - '0')) % modValue;
        }

        bw.write(Long.toString(remainder));
        bw.flush();
        bw.close();
	}
}