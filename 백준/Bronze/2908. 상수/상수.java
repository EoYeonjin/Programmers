import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.print(num(A, B));
    }

    public static String num(int A, int B){
        StringBuilder sb = new StringBuilder();
        int max = A;
        for (int i=0; i<3; i++) {
            if((A%10) < (B%10)) max = B;
            else if((A%10) == (B%10)){
                if((A%100)/10 < (B%100)/10) max = B;
                else if((A%100)/10 == (B%100)/10){
                    if(A/100 < B/100) max = B;
                }
            }
        }

        sb.append(max%10).append((max%100)/10).append(max/100);

        return sb.toString();
    }
}