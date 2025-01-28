import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int ret =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
        }
        int X = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int l = 0;
        int r = n-1;
        while(l < r){
            if(arr[l] + arr[r] == X){
                ret++;
                r--;
            }
            else if(arr[l] + arr[r] > X){
                r--;
            }
            else if(arr[l] + arr[r] < X){
                l++;
            }
        }
        System.out.println(ret);
    }

}
