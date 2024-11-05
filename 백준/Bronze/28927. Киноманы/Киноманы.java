import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = score(br.readLine(), br.readLine());
        
        System.out.println(result);
	}
    
    public static String score(String f1, String f2){
        StringTokenizer st = new StringTokenizer(f1);
        int max = sum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(f2);
        int mel = sum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        
        if(max > mel) return "Max";
        else if(max < mel) return "Mel";
        else return "Draw";
	}

    public static int sum(int t, int e, int f){
        return (3*t) + (20*e) + (120*f);
    }
}