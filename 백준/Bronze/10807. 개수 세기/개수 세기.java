import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        int count = 0;
        
        for (int i=0; i<=N; i++) {
            arr.add(sc.nextInt());
        }
        
        for(int i=0; i<N; i++){
            if(arr.get(N) == arr.get(i)) count++;
        }

        System.out.print(count);
    }
}