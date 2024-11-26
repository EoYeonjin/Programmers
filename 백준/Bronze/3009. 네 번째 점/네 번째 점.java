import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.print(point(xArr, yArr));
    }

    public static String point(int[] xArr, int[] yArr){
        Arrays.sort(xArr);
        Arrays.sort(yArr);

        int xDistance = xArr[1] == xArr[0] ? xArr[2] : xArr[0];
        int yDistance = yArr[1] == yArr[0] ? yArr[2] : yArr[0];
        
        return xDistance+" "+yDistance;
    }
}