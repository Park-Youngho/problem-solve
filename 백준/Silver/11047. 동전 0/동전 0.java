import java.util.*;

public class Main {
    static int n,m;
    static int[] arr;
    static int[] memo = new int[100];
    static int max = Integer.MIN_VALUE;
    static Stack<Integer> stk = new Stack<>();
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            stk.push(k);
        }
        while(!stk.isEmpty()){
            int top = stk.peek();
            if(top <= m) {
                cnt += m/top;
                m %= top;
            }
            else stk.pop();
        }
        System.out.println(cnt);
    }
}
