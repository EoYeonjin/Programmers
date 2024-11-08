import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String name = manage(br.readLine());
            System.out.println(name);
        }
    }

    public static String manage(String a){
        return a.toLowerCase();
	}
}