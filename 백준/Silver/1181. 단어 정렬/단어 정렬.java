import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        Set<String> unique = new LinkedHashSet<>(Arrays.asList(arr));
        arr = unique.toArray(new String[0]);
        
        Arrays.sort(arr, Comparator.comparingInt(String::length)
                    .thenComparing(Comparator.naturalOrder()));

        StringBuilder sb = new StringBuilder();
        
        for (String s : arr) {
            sb.append(s+"\n");
        }
        
        System.out.print(sb);
	}
}