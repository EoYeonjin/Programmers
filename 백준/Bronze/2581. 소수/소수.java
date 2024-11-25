import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
          
        System.out.print(prime(M, N));
    }

    public static String prime(int M, int N){
        StringBuilder result = new StringBuilder();
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i=M; i<=N; i++) {
            if(isPrime(i)){
                sum += i;
                if(min > i) min = i;
            }
        }

        if(sum == 0) return "-1";
        else return result.append(sum).append("\n").append(min).toString();
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for (int i=3; i*i<=num; i+=2) {
            if(num%i == 0) return false;
        }
        return true;
    }
}