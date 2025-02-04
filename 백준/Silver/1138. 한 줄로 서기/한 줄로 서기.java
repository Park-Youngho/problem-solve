import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static List<Integer> v = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr= new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=n-1; i>=0; i--){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k=n;
        for(int i=0; i<n; i++){
            v.add(arr[i], k--);
        }
        for(int i: v){
            System.out.print(i+ " ");
        }
    }
}
