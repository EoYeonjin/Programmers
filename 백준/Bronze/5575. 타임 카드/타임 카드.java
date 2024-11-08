import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s=br.readLine()) != null) {
            String time = working(s);
            System.out.println(time);
        }
    }

    public static String working(String s){
        StringTokenizer st = new StringTokenizer(s);
        int hr1 = Integer.parseInt(st.nextToken());
        int min1 = Integer.parseInt(st.nextToken());
        int sec1 = Integer.parseInt(st.nextToken());
        int hr2 = Integer.parseInt(st.nextToken());
        int min2 = Integer.parseInt(st.nextToken());
        int sec2 = Integer.parseInt(st.nextToken());

        int sec = sec2 - sec1;
        int min = 0;
        int hr = 0;
        if(sec < 0){
            sec += 60;
            min = min2 - min1 -1;
        }else min = min2 - min1;
        
        if(min < 0){
            min += 60;
            hr = hr2- hr1 -1;
        }else hr = hr2- hr1;
        
        return hr+" "+min+" "+sec;
	}
}