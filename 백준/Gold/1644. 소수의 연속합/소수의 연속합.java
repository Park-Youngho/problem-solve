import java.io.*;
import java.util.*;

public class Main {
    static int n,k;
    static int ret =0;
    static int[] sumarr;
    static int[] arr;
    static List<Integer> v = new ArrayList<>();
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
        sumarr= new int[n+1];
        arr = new int[n+1];
        int idx =1;
        for(int i=2; i<n; i++){
            if(check(i)){
                arr[idx] = i;
                idx++;
            }
        }

        for(int i=1; i<idx; i++){
            sumarr[i] += (sumarr[i-1] + arr[i]);
        }

        int l = 0;
        int r = 1;
        for(int i=0; i<n; i++){
            if(sumarr[r]==0) break;
            if(sumarr[r]-sumarr[l] < n){
                r++;
            }else if(sumarr[r]-sumarr[l] ==n){
                ret++;
                r++;
            }else{
                l++;
            }
        }
        if(check(n)) ret++;
        System.out.println(ret);
    }





}
