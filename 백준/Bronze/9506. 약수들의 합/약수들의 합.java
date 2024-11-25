import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            sb.append(divisor(n)).append("\n");
        }
          
        System.out.print(sb);
    }

    public static String divisor(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int sum = 0;
        result.append(n).append(" = ");

        for (int i = 1; i*i<=n; i++) {
            if(n%i == 0){
                sum += i;
                if(i != n){
                    arr.add(i);
                }
                if(i != n/i && i != 1){
                    sum += n/i;
                    arr.add(n/i);
                }
            }
        }

        Collections.sort(arr);

        if(sum == n){
            for (int i=0; i<arr.size(); i++) {
                result.append(arr.get(i));
                if(i != arr.size() - 1) result.append(" + ");
            }
            return result.toString();
        }else return n+" is NOT perfect.";
    }
}