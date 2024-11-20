import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        for (int i=0; i<6; i++) {
            if(br.readLine().equals("W")) count++;
        }
        if(count >= 5) System.out.print(1);
        else if(count >= 3) System.out.print(2);
        else if(count >= 1) System.out.print(3);
        else System.out.print(-1);
        
    }
}