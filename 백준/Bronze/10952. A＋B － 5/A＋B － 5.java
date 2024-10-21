import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        int result = 0;

        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();
            if(A == 0 && B == 0) break;
            result = A + B;
            System.out.println(result);
        }
    }
}