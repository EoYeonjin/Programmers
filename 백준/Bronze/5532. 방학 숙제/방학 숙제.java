import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int day = homework(L, A, B, C, D);
        System.out.println(day);
    }

    public static int homework(int L, int A, int B, int C, int D){
        int X = (int)Math.ceil((double)A/C) > (int)Math.ceil((double)B/D) ? (int)Math.ceil((double)A/C) : (int)Math.ceil((double)B/D);
        
        return L-X;
	}
}