import java.util.*;

public class Main {
    static int n,m;
    static List<Integer>[] adj;
    static boolean [] visited;
    static Queue<Integer> q = new LinkedList<>();
    static int[] arr;
    static int ret=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n+1];
        adj = new ArrayList[n+1];
        arr = new int[n+1];
        for(int i=0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        while(m-->0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        bfs(1);
        System.out.println(ret);
    }
    static void bfs(int here) {
        q.add(here);
        while (!q.isEmpty()) {
            here = q.poll();
            visited[here] = true;
            for(int there: adj[here]){
                if(!visited[there]){
                    q.add(there);
                    if(arr[there] ==0){
                        arr[there]=1;
                        ret++;
                    }
                }
            }
        }
    }

}
