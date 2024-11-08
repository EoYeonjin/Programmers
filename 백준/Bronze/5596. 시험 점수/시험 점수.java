import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = score(br.readLine(), br.readLine());
        System.out.print(score);
    }

    public static int score(String min, String man){
        StringTokenizer st = new StringTokenizer(min);
        int info1 = Integer.parseInt(st.nextToken());
        int math1 = Integer.parseInt(st.nextToken());
        int sci1 = Integer.parseInt(st.nextToken());
        int eng1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(man);
        int info2 = Integer.parseInt(st.nextToken());
        int math2 = Integer.parseInt(st.nextToken());
        int sci2 = Integer.parseInt(st.nextToken());
        int eng2 = Integer.parseInt(st.nextToken());
        
        int score = (info1+math1+sci1+eng1) >= (info2+math2+sci2+eng2) ? (info1+math1+sci1+eng1) : (info2+math2+sci2+eng2);
        
        return score;
	}
}