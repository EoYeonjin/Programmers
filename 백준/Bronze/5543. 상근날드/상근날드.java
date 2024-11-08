import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int coke = Integer.parseInt(br.readLine());
        int sprite = Integer.parseInt(br.readLine());

        int burger = burger(L, M, S);
        int drink = drink(coke, sprite);
        
        System.out.println(burger+drink-50);
    }

    public static int burger(int L, int M, int S){
        int min = L;
        if(min > M) min = M;
        if(min > S) min = S;
        
        return min;
	}

    public static int drink(int coke, int sprite){
        int min = 0;
        if(coke > sprite) min = sprite;
        else min = coke;

        return min;
    }
}