import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        String s;
        int j = 0;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            for (int i=0; i<9; i++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
            j++;
        }

        System.out.print(max(arr));
    }

    public static String max(int[][] arr){
        int max = arr[0][0];
        int a = 0, b = 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if(max <= arr[i][j]){
                    max = arr[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }

        return max +"\n"+ a +" "+ b;
    }
}