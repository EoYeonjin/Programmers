import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=N; i>0; i--) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num%10;
                num = num/10;
            }

            if(sum + i == N){
                result = i;
                if(sum + i < N) break;
            }
        }
        System.out.print(result);
    }        
}