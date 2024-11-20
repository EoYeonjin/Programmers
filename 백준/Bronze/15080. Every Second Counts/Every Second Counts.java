import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(meals(br.readLine(), br.readLine()));
    }

    public static int meals(String s1, String s2){
        StringTokenizer st = new StringTokenizer(s1);
        int hr1 = Integer.parseInt(st.nextToken());
        st.nextToken();
        int min1 = Integer.parseInt(st.nextToken());
        st.nextToken();
        int sec1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(s2);
        int hr2 = Integer.parseInt(st.nextToken());
        st.nextToken();
        int min2 = Integer.parseInt(st.nextToken());
        st.nextToken();
        int sec2 = Integer.parseInt(st.nextToken());

        int time = 0;

        if(sec2 < sec1){
            min2 -= 1;
            time += sec2 - sec1 +60;
        }else time += sec2 - sec1;

        if(min2 < min1){
            hr2 -=1;
            time += (min2 - min1 +60)*60;    
        }else time += (min2 - min1)*60;

        if(hr1 > hr2){
            hr2 += 24;
            time += (hr2 - hr1)*60*60; 
        }else time += (hr2 - hr1)*60*60; 
        
        return time;
    }
}