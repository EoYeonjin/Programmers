import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sleep = Integer.parseInt(br.readLine());
        int wakeup = Integer.parseInt(br.readLine());

        if(20 <= sleep && sleep <= 23) System.out.print((24-sleep) + wakeup);
        else System.out.print(wakeup - sleep);
	}
}