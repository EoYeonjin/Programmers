import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            double a = Double.parseDouble(br.readLine());
            if(a < 0) break;

            System.out.println("Objects weighing "+String.format("%.2f", a)+" on Earth will weigh "+String.format("%.2f", (a*0.167))+" on the moon.");
        }
    }
}