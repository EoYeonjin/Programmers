import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            BigInteger num = new BigInteger(br.readLine());
            if(num.equals(BigInteger.ZERO)) break;
            sb.append(lotto(num)).append("\n");
        }
        
        System.out.print(sb);
	}
    
    public static String lotto(BigInteger num){
        if(num.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) return "PREMIADO";
        else return "TENTE NOVAMENTE";
	}
}