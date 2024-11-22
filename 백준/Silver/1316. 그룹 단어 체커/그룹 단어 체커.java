import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=0; i<N; i++) {
            if(group(br.readLine())) result++;
        }

        System.out.print(result);
    }

    public static boolean group(String word){
        boolean[] arr = new boolean[26];
        char pre = 0;

        for (int i=0; i<word.length(); i++) {
            char cur = word.charAt(i);
            if(pre != cur){
                if(arr[cur - 'a']) return false;
                arr[cur - 'a'] = true;
            }
            pre = cur;
        }

        return true;
    }
}