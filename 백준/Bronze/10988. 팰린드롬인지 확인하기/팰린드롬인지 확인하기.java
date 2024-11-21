import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        System.out.print(palindrome(N));
    }

    public static int palindrome(String N){
        int state = 1;
        if(N.length()%2 == 0){
            int i = N.length()/2;
            int j = N.length()/2-1;
            while (i>0 || j<N.length()) {
                if(N.charAt(i) == N.charAt(j)) state = 1;
                else{
                    state = 0;
                    break;
                } 
                i--;
                j++;
            }
        }else{
            int i = N.length()/2-1;
            int j = N.length()/2+1;
            while (i>0 || j<N.length()) {
                if(N.charAt(i) == N.charAt(j)) state = 1;
                else{
                    state = 0;
                    break;
                } 
                i--;
                j++;
            }
        }
        return state;
    }
}