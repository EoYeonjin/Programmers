import java.io.*;
import java.util.*;

public class Main {
    private static char[] letters;
    private static boolean[] used;
    private static StringBuilder str = new StringBuilder();
    private static int vowels = 0, consonant = 0, L;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        letters = new char[C];
        used = new boolean[C];
        
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<C; i++) {
            letters[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(letters);

        secrets(0);

        System.out.print(sb);
    }

    public static void secrets(int start){
        if(str.length() == L ){
            if(vowels >= 1 && consonant >= 2) sb.append(str).append("\n");
            return;
        }

        for (int i=start; i<letters.length; i++) {
            if(used[i]) continue;
            
            str.append(letters[i]);
            used[i] = true;
            if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') vowels++;
            else consonant++;

            secrets(i+1);
            
            if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') vowels--;
            else consonant--;
            str.deleteCharAt(str.length() - 1);
            used[i] = false;
            
        }
    }
}