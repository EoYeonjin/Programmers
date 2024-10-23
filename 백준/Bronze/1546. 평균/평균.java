import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        double result = ave(N, arr);
    	System.out.print(result);
	}
	
	static double ave(int N, int[] arr){
		int max = arr[0];
		double sum = 0;
		
		for(int i=0; i<N; i++){
			if(max < arr[i]) max = arr[i];
		}
		
		for(int i=0; i<N; i++){
			sum += (arr[i]/(double)max)*100;
		}
		
        return sum / N;
	}
}