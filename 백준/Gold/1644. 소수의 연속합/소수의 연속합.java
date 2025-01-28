import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int answer = 0;
    static int[] prefixSum;
    static List<Integer> primes = new ArrayList<>();

    // 에라토스테네스의 체를 사용해 소수 구하기
    static void findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 리스트 생성
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 1. 소수 구하기
        findPrimes(n);

        // 2. 누적 합 배열 생성
        prefixSum = new int[primes.size() + 1];
        for (int i = 1; i <= primes.size(); i++) {
            prefixSum[i] = prefixSum[i - 1] + primes.get(i - 1);
        }

        // 3. 두 포인터 알고리즘으로 경우의 수 찾기
        int left = 0, right = 1;
        while (right <= primes.size()) {
            int sum = prefixSum[right] - prefixSum[left];
            if (sum < n) {
                right++; // 합이 작으면 right 포인터를 오른쪽으로 이동
            } else if (sum > n) {
                left++;  // 합이 크면 left 포인터를 오른쪽으로 이동
            } else {
                answer++; // 합이 n과 같으면 정답 카운트 증가
                right++;  // right 포인터를 오른쪽으로 이동
            }
        }

        // 4. 결과 출력
        System.out.println(answer);
    }
}