import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(hangul(N));
    }

    public static char hangul(int N){
        N -= 1;
        int code = 0xAC00 + ((N / (21 * 28)) * 28 * 21) 
                          + ((N%(21*28)) / 28 * 28) + (N%(21*28))%28;

        return (char) code;
    }
}