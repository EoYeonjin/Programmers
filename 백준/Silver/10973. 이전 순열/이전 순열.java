import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String target;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        target = br.readLine();
        visited = new boolean[N+1];

        findPrePermutation();
    }

    public static void findPrePermutation(){
        String[] arr = target.split(" ");
        int[] nums = new int[N];
        
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        if(PrePermutation(nums)) {
            for (int i=0; i<N; i++) {
                System.out.print(nums[i] + " ");
            }
        }else System.out.print(-1);
    }

    public static boolean PrePermutation(int[] arr){
        int i = arr.length - 1;

        while (i>0 && arr[i-1] <= arr[i]) i--;
        if(i == 0) return false;

        int j = arr.length - 1;

        while (arr[i-1] <= arr[j]) j--;

        swap(arr, i-1, j);

        int left = i, right = arr.length - 1;
        while (left < right) swap(arr, left++, right--);
        
        return true;    
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}