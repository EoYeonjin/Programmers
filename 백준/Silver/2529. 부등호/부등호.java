import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] visited = new boolean[10];
    public static int k;
    public static String max = "", min = "";
    public static int[] result;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        String[] arr = new String[k];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<k; i++) {
            arr[i] = st.nextToken();
        }

        result = new int[k+1];
        backtrack(arr, 0);
        
        System.out.println(max);
        System.out.print(min);
    }

    public static void backtrack(String[] arr, int depth){
        if(depth == k+1){
            if(isValid(arr)){
                StringBuilder sb = new StringBuilder();
                for (int i=0; i< k+1; i++) {
                    sb.append(result[i]);
                }

                String value = sb.toString();
                if(max.equals("") || value.compareTo(max) > 0) max = value;
                if(min.equals("") || value.compareTo(min) < 0) min = value;
            }
            return;
        }

        for (int i=0; i<10; i++) {
            if(!visited[i]){
                result[depth] = i;
                visited[i] = true;
                backtrack(arr, depth+1);
                visited[i] = false;
            }
        }
    }

    public static boolean isValid(String[] arr){
        for (int i=0; i<k; i++) {
            if(arr[i].equals("<")){
                if(result[i] >= result[i+1]) return false;
            }else if(arr[i].equals(">")){
                if(result[i] <= result[i+1]) return false;
            }
        }

        return true;
    }
}