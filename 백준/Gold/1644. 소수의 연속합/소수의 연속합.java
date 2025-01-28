import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int ret =0;
    static int[] sumarr;
    static int[] arr;
    static boolean[] isPrime;
    static List<Integer> v = new ArrayList<>();
    static void check(int n){

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i<=Math.sqrt(n); i++){
            for(int j=i*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        for(int i=0; i<isPrime.length-1; i++){
            if(isPrime[i]) v.add(i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        isPrime = new boolean[n+1];
        check(n);

        sumarr= new int[v.size()+1];

        for(int i=1; i<=v.size(); i++){
            sumarr[i] += (sumarr[i-1] + v.get(i-1));
        }

        int l = 0;
        int r = 1;
        while(r <= v.size()){
            int sum =sumarr[r]-sumarr[l];
            if(sum < n) r++;
            else if(sum > n) l++;
            else {
                ret++;
                r++;
            }
        }
        if (isPrime[n]) {
            ret++;
        }
        System.out.println(ret);
    }





}
