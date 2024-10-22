import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        ArrayList<String> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }

        System.out.print(arr.size());
    }
}