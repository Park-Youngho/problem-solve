import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static double temp;
    static PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
    static List<Double> v = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            temp = Double.parseDouble(br.readLine());
            if (pq.size() == 7) {
                pq.add(temp);
                pq.poll();
            } else {
                pq.add(temp);
            }
        }

        while (!pq.isEmpty()) {
            v.add(pq.poll());
        }

        v.sort(null);

        for (double i : v) {
            System.out.printf("%.3f\n", i);
        }
    }
}
