import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static int[] arr;
    static int[] ret;
    static boolean[] visited;
    static void permutation(int depth){
        if(depth == m){
            for(int i=0; i<m; i++){
                System.out.print(ret[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                ret[depth] = arr[i];
                permutation(depth+1);
                visited[i] =false;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ret = new int[m];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        permutation(0);
    }
}
