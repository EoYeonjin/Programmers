import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (true) {
            String s = br.readLine();
            if(s == null) break;
            count++;
        }

        sb.append(count);

        System.out.print(sb);
	}
}