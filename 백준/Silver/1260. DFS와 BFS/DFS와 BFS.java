import java.util.*;

public class Main {
    static int n,m;
    static List<Integer>[] adj;
    static boolean [] visited;
    static int ret=0;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int v = sc.nextInt();
        adj = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        for(int i =1; i<adj.length; i++){
            Collections.sort(adj[i]);
        }
        dfs(v);
        Arrays.fill(visited, false);
        System.out.println();
        bfs(v);
    }
    static void dfs(int here){
        if(visited[here]) return;
        visited[here] = true;
        System.out.print(here + " ");
        for(int there : adj[here]){
            if(!visited[there]){
                dfs(there);
            }
        }
    }
    static void bfs(int here){
        q.add(here);
        visited[here] = true;
        System.out.print(here + " ");
        while (!q.isEmpty()) {
            here = q.poll();
            for(int there: adj[here]){
                if(visited[there]) continue;
                q.add(there);
                visited[there] = true;
                System.out.print(there + " ");
            }
        }
    }





}
