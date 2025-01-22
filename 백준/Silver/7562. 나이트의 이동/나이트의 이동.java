import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Array;
import java.util.*;

public class Main {
    static int n,m,k;
    static int[][] arr;
    static int[] dy = {-2,-1, 1, 2, 2, 1, -1, -2};
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int visited[][];
    static Queue<int[]> q = new LinkedList<>();
    static int go(int y, int x, int y2, int x2) {
        q.add(new int[]{y,x});
        visited[y][x] = 1;
        while(!q.isEmpty()){
            int[] a = q.poll();
            y = a[0];
            x = a[1];
            for(int i=0; i<8; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                if(ny <0 || nx <0 || ny >=n || nx >=n || visited[ny][nx] > 0) continue;
                q.add(new int[]{ny,nx});
                visited[ny][nx] = visited[y][x] + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        while(k-->0){
            n= sc.nextInt();
            arr= new int[n][n];
            visited = new int[n][n];
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            go(x,y,x2,y2);
            System.out.println(visited[x2][y2]-1);
        }


    }
}
