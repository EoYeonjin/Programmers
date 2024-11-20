import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(meals(br.readLine(), br.readLine()));
    }

    public static int meals(String s1, String s2){
        StringTokenizer st = new StringTokenizer(s1);
        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(s2);
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());

        int sum = 0;
        if(Ca < Cr) sum += Cr - Ca;
        if(Ba < Br) sum += Br - Ba;
        if(Pa < Pr) sum += Pr - Pa;
        
        return sum;
    }
}