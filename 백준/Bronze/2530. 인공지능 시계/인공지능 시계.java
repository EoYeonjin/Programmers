import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String time = oven(br.readLine(), Integer.parseInt(br.readLine()));

        System.out.print(time);
	}

    public static String oven(String s, int cook){
        StringTokenizer st = new StringTokenizer(s);
        int hr = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        sec += (cook%60);
        min += (cook/60);
        
        if(sec >= 60){
            min += sec/60;
            sec %= 60;
        }
        
        if(min >= 60){
            hr += min/60;
            min %= 60;
        }
        if(hr >= 24) hr %= 24;
            
       return hr+" "+min+" "+sec;
	}
}