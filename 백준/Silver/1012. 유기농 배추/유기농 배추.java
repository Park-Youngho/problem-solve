import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Array;
import java.util.*;

public class Main {
    static int n,m,k;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    static int[][] a;
    static boolean [][]visited;
    static int ret =0;
    static void component(int y, int x){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny<0 || nx <0 || ny >=n || nx >= m || visited[ny][nx]||
            a[ny][nx] != 1) continue;
            component(ny,nx);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            a = new int[n][m];
            ret=0;
            visited=  new boolean[n][m];
            while(k-->0){
                st= new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[x][y] = 1;
            }
            for(int i= 0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(a[i][j] ==1 && !visited[i][j]){
                        component(i,j);
                        ret++;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
