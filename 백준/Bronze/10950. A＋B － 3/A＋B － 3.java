import java.util.*;
import java.time.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A, B;
        int result = 0;

        for(int i=0; i<N; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            result = A + B;
            System.out.println(result);
        }
    }
}