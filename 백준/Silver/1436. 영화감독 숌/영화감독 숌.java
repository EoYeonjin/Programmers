import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(movie(N));
    }

    public static int movie(int N){
        int count = 0;
        int num = 666;

        while (true) {
            if(String.valueOf(num).contains("666")) count++;
            if(count == N) break;
            num++;
        }

        return num;
    }
}