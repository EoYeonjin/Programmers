import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i=0; i<N; i++) {
            arr.add(sc.nextInt());
        }

        for(int i=0; i<N; i++){
            if(arr.get(i) < X) System.out.print(arr.get(i)+" ");
        }

    }
}