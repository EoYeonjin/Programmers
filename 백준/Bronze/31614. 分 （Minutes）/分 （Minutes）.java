import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(minutes(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}

    public static int minutes(int H, int M){
        return (60*H) + M;
	}
}