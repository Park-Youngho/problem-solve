import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Array;
import java.util.*;

public class Main {
    static int n,m,k;
    static char[][] arr;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static int[][] a;
    static int [][]visited;
    static int ret =0;
    static int cnt=1;
    static Queue<int[]> q = new LinkedList<>();
    static void go(int y, int x) {
       visited[y][x] = 1;
       q.add(new int[]{y,x});
       while(!q.isEmpty()){
           int[] poll = q.poll();
           y = poll[0];
           x = poll[1];
           for(int i=0; i<4; i++){
               int ny = y + dy[i];
               int nx = x + dx[i];
               if(ny<0 || nx <0 || ny>=n || nx >=m || visited[ny][nx] !=0 ||
               arr[ny][nx] == '0') continue;
               q.add(new int[]{ny,nx});
               visited[ny][nx] = visited[y][x] + 1;
           }
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        sc.nextLine();
        arr = new char[n][m];
        visited = new int[n][m];

        for(int i=0; i<n; i++){
            String s= sc.nextLine();
            arr[i] = s.toCharArray();
        }

        go(0,0);
        System.out.println(visited[n-1][m-1]);
    }
}
