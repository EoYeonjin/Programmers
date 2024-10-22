import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i=0; i<T; i++) {
            String s = br.readLine();
            int score = 0, sum = 0;
            for (int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'O') {
                    score += 1;
                    sum += score;
                }else score = 0;
            }
            System.out.println(sum);
        }
    }        
}