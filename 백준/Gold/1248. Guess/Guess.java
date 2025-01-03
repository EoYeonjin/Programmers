import java.io.*;
import java.util.*;

public class Main {
    static char[][] signMatrix;
    static int n;
    static int[] sequence;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        signMatrix = new char[n][n];

        String sign = br.readLine();
        int idx = 0;
        
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                signMatrix[i][j] = sign.charAt(idx++);
            }
        }

        sequence = new int[n];
        
        if(backtrack(0)){
            for (int num : sequence) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean backtrack(int depth){
        if(depth == n){
            if(isValid()){
               return true;
            }
            return false;
        }

        for (int i=-10; i<=10; i++) {
                sequence[depth] = i;
            if(isValidPartial(depth)){
                if(backtrack(depth + 1)) return true;
            }
        }
        return false;
    }

    public static boolean isValidPartial(int depth){
        for (int i=0; i<=depth; i++) {
            for (int j=i; j<=depth; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    sum += sequence[k];
                }

                if(sum > 0 && signMatrix[i][j] != '+') return false;
                if(sum < 0 && signMatrix[i][j] != '-') return false;
                if(sum == 0 && signMatrix[i][j] != '0') return false;
            }
        }
        return true;
    }

    public static boolean isValid(){
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    sum += sequence[k];
                }

                if(sum > 0 && signMatrix[i][j] != '+') return false;
                if(sum < 0 && signMatrix[i][j] != '-') return false;
                if(sum == 0 && signMatrix[i][j] != '0') return false;
            }
        }
        return true;
    }
}