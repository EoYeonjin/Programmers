import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;        
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> compressMap = new HashMap<>();

        int rank = 0;
        for (int value : sortedArr) {
            if(!compressMap.containsKey(value)){
                compressMap.put(value, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(compressMap.get(arr[i])).append(" ");
        }

        System.out.print(sb);
    }
}