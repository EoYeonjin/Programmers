import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        sb.append("Gnomes:").append("\n");

        for (int i=0; i<N; i++) {
            String gnome = gnome(br.readLine());
            sb.append(gnome).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String gnome(String s){
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        if(Arrays.equals(arr, copy)) return "Ordered";

        int left = 0, right = copy.length - 1;
        while (left < right) {
            int temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;
            left++;
            right--;
        }
        if(Arrays.equals(arr, copy)) return "Ordered";

        return "Unordered";
	}
}