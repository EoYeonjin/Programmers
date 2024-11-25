import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(middle(N));
        
    }

    public static int middle(int N){
        int dot = 2;

        for (int i=0; i<N; i++) {
                dot += (dot-1); 
        }

        return dot*dot;
    }
}