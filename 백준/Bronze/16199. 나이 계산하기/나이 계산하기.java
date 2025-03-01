import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year_1 = Integer.parseInt(st.nextToken());
        int month_1 = Integer.parseInt(st.nextToken());
        int day_1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int year_2 = Integer.parseInt(st.nextToken());
        int month_2 = Integer.parseInt(st.nextToken());
        int day_2 = Integer.parseInt(st.nextToken());

        int age = year_2 - year_1;
        if (month_2 < month_1 || (month_2 == month_1 && day_2 < day_1)) age--; 
        
        int koreaAge = year_2 - year_1 + 1;
        
        int yearAge = year_2 - year_1;
        
        StringBuilder sb = new StringBuilder();
        sb.append(age).append("\n");
        sb.append(koreaAge).append("\n");
        sb.append(yearAge).append("\n");

        System.out.print(sb.toString());
    }
}