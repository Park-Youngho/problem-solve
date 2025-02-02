import java.io.*;
import java.util.*;

public class Main {
    static int n, m,ret=-1;
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr= new Integer[n];
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            arr[i]=k;
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int h=0, m=1, l=2;
        while(h < n-2){
            if(arr[h] < arr[m]+ arr[l]){
                ret = arr[h]+arr[m]+arr[l];
                break;
            }
            else{
                h++;
                m++;
                l++;
            }
        }
        System.out.println(ret);


    }
}
