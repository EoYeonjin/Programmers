import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = search(arr, N, M);
        System.out.print(result);
	}
	
	static int search(int[] arr, int N, int M){
		int result = 0;
		
		for(int i=0; i<N-2; i++){
        	if(arr[i] > M) continue;
        	
        	for(int j=i+1; j<N-1; j++){
        		if(arr[i] + arr[j] > M) continue;
        		
        		for(int k=j+1; k<N; k++){
        			int sum = arr[i] + arr[j] + arr[k];
        			if(sum == M) return sum;
        			if(result < sum && sum < M) result = sum;
        		}
        	}
        }
        return result;
	}
}