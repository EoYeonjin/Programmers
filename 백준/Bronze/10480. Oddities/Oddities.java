import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            sb.append(oddities(Integer.parseInt(br.readLine()))).append("\n");
        }
            
        System.out.print(sb);
    }

    public static String oddities(int x){
        if(x%2 == 0) return x+" is even";
        else return x+" is odd";
    }
}