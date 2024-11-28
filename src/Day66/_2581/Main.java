package Day66._2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min == Integer.MAX_VALUE) min = i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}