import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Point> points = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new Point(x, y));            
        }

        points.sort(new Comparator<Point>(){
            @Override
            public int compare(Point p1, Point p2){
                if(p1.x == p2.x){
                    return Integer.compare(p1.y, p2.y);
                }

                return Integer.compare(p1.x, p2.x);
            }
        });

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point{
        int x, y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}