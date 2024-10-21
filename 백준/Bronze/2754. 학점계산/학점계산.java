import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        double result = 0;

        for (int i=0; i<score.length(); i++) {
            char c = score.charAt(i);
            if(c == 'A') result += 4.0;
            else if(c == 'B') result += 3.0;
            else if(c == 'C') result += 2.0;
            else if(c == 'D') result += 1.0;
            else if(c == '+') result += 0.3;
            else if(c == '0') result += 0;
            else if(c == '-') result -= 0.3;
            else result = 0.0;
        }

        System.out.print(result);
    }
}