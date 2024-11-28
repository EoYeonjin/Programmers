import java.io.*;
import java.util.*;
 
public class Main {
    
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        
        for (int i=0; i<9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
        }

        outer:
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                int sum = 0;
                for (int k=0; k<9; k++) {
                    if(k != i && k != j) sum += dwarf[k];
                }

            if(sum == 100){
                List<Integer> result = new ArrayList<>();
                for (int k=0; k<9; k++) {
                    if(k != i && k != j) result.add(dwarf[k]);
                }

                Collections.sort(result);
                for (int height : result) {
                    System.out.println(height);
                }
                break outer;
            }
            }
        }
    }
}