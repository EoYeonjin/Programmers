import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.print(word(s));
    }

    public static String word(String s){
        int[] arr = new int[26];
        String word = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
            arr[word.charAt(i) - 65] += 1;
        }

        int max = arr[0];
        int num = 0;
        String state = "";
        for (int i=1; i<arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                num = i;
                state = "";
            }else if(max == arr[i]) state = "?";
        }

        return state.equals("?") ? state : String.valueOf((char) (num + 65));
    }
}