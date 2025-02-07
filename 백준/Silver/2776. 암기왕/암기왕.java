import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int t,n;
    static int[] arr;
    static void bs(int[] arr, int target) throws IOException{
        int r = arr.length-1;
        int l = 0;
        while(l<=r){
            int mid=  l+ (r-l)/2;
            if(arr[mid] == target) {
                bw.write("1" + "\n");
                return;
            }else if(arr[mid] > target) r = mid -1;
            else l = mid+1;
        }
        bw.write("0" + "\n");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while(t-->0){
            n = Integer.parseInt(br.readLine());
            arr=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int target =Integer.parseInt(st.nextToken());
                bs(arr,target);
            }
        }
        bw.flush();
        bw.close();
    }

}
