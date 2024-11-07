import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if(s.equals("#")) break;
            int count = 0;

            for (int i=0; i<s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
            }
            sb.append(count).append("\n");
        }
        
        System.out.print(sb);
	}
}