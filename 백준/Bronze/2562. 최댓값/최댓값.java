import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        String Number;

        while (true) {
            Number = br.readLine();
            if(Number == null) break;
            arr.add(Integer.parseInt(Number));
        }

        int max = arr.get(0), index = 1;
        
        for (int i=1; i<arr.size(); i++) {
            if(max < arr.get(i)){
                max = arr.get(i);
                index = i+1;
            }
        }

        System.out.println(max+"\n"+index);
    }
}