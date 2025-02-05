import java.io.*;
import java.util.*;

public class Main {
    static long n, l;
    static PriorityQueue<Long> pq = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        while(n-->0){
            int k= Integer.parseInt(br.readLine());
            if(k==0){
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            }
            else{
                pq.add((long)k);
            }
        }
    }
}
