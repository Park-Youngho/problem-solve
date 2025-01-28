import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int ret =0;
    static int[] sumarr;
    static int[] arr;
    static boolean check(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if((n % i) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        int idx =0;
        for(int i=2; i<n; i++){
            if(check(i)){
                arr[idx] = i;
                idx++;
            }
        }
        sumarr= new int[idx+1];
        for(int i=1; i<=idx; i++){
            sumarr[i] += (sumarr[i-1] + arr[i-1]);
        }

        int l = 0;
        int r = 1;
        while(r < idx+1){
            int sum =sumarr[r]-sumarr[l];
            if(sum < n) r++;
            else if(sum > n) l++;
            else {
                ret++;
                r++;
            }
        }
        if(check(n)) ret++;
        System.out.println(ret);
    }





}
