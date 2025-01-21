import java.util.*;

public class Main {
    static int n,m;
    static int[] arr;
    static boolean bs(int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else right = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int k = sc.nextInt();
            if(bs(k)){
                System.out.println(1);
            }else System.out.println(0);
        }

    }
}
