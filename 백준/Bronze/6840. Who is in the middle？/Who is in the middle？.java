import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            String N = br.readLine();
            if(N == null) break;
            arr.add(Integer.parseInt(N));
        }

        Collections.sort(arr);
        int median = arr.get(arr.size()/2);

        sb.append(median+"\n");

        System.out.print(sb);
	}
}