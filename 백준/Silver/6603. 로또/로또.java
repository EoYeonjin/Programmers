import java.io.*;
import java.util.*;

public class Main {
    static int N = 6;
    static boolean[] visited;
    static String[] arr, result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(s);
            int length = Integer.parseInt(st.nextToken());
            arr = new String[length];
            result = new String[N];
            visited = new boolean[length];

            for (int i=0; i<length; i++) {
                arr[i] = st.nextToken();
            }
            
            backtrack(0, 0);
            System.out.println();
        }
    }

    public static void backtrack(int count, int start){
        if(count == N){
            String string = "";
            for (int i=0; i<count; i++) {
                string += result[i] + " ";
            }
            System.out.println(string.trim());
            return;
        }

        for (int i=start; i<arr.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                result[count] = arr[i];
                backtrack(count+1, i+1);
                visited[i] = false;
            }
        }
    }
}