import java.io.*;
import java.util.*;

public class Main {
    static int n;

    static int ret =0;
    static int deadLine=0;
    static Pair[] pairs;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        pairs = new Pair[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dead = Integer.parseInt(st.nextToken());
            int cup = Integer.parseInt(st.nextToken());
            pairs[i] = new Pair(dead, cup);
        }
        Arrays.sort(pairs, (x,y)->{
            if(x.dead==y.dead) return Integer.compare(x.cup, y.cup);
            return Integer.compare(x.dead, y.dead);
        });
        for(int i=0; i<n; i++){
            pq.add(pairs[i].cup);
            if(pq.size() > pairs[i].dead){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            ret+= pq.poll();
        }
        System.out.println(ret);
    }
    static class Pair{
        int dead, cup;
        Pair(int dead, int cup){
            this.dead = dead;
            this.cup = cup;
        }
    }


}
