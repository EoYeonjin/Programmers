import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            sb.append(gather(br.readLine())).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String gather(String s){
        StringTokenizer st = new StringTokenizer(s);
        String num = st.nextToken();
        int strategy = Integer.parseInt(st.nextToken());
        int management = Integer.parseInt(st.nextToken());
        int technology = Integer.parseInt(st.nextToken());

        int sum = strategy + management + technology;
        
        if(sum >= 55){
            if(strategy < 35*0.3) return num+" "+sum+" FAIL";
            if(management < 25*0.3) return num+" "+sum+" FAIL";
            if(technology < 40*0.3) return num+" "+sum+" FAIL";
            return num+" "+sum+" PASS";
        }else return num+" "+sum+" FAIL";

    }
}