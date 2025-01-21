import java.util.*;

public class Main {
    static int n,m;
    static int[] arr;
    static int[] psum;
    static int ret =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        psum = new int[n];
        Arrays.sort(arr);
        psum[0] = arr[0];
        for(int i=1; i<n; i++){
            psum[i] = psum[i-1] + arr[i];
        }
        for(int i=0; i<n; i++){
            ret += psum[i];
        }
        System.out.println(ret);
    }
}
