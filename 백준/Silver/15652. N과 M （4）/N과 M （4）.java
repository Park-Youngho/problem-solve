import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    static int n,m;
    static int[] arr,ret;
    static boolean[] visited;
    static List<Integer> v = new ArrayList<>();
    static void permutation(int start, int depth){
        if(depth==m){
            for(int i=0; i<m; i++){
                System.out.print(ret[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=start; i<n; i++){
            ret[depth] = arr[i];
            permutation(i, depth+1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ret = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = i+1;
        }
        permutation(0,0);

    }
}
