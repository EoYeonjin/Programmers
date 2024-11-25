import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
          
        System.out.print(factorization(N));
    }

    public static String factorization(int N){
        StringBuilder result = new StringBuilder();
        if(N == 1) return "";
        else if(prime(N)) return result.append(N).toString();
        else{
            for (int i=2; i*i<=N; i++) {
                while (N%i == 0) {
                    result.append(i).append("\n");
                    N /= i;
                }
            }
            if(N != 1) result.append(N);
        }

        return result.toString();
    }

    public static boolean prime(int N){
        if(N == 2) return true;
        if(N % 2 == 0) return false;
        for (int i=3; i*i<=N; i+=2) {
            if(N%i == 0) return false;
        }
        return true;
    }
}