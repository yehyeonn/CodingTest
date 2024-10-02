package Day62._10539;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for(int i = 0; i< N; i++) {
            int M = Integer.parseInt(st.nextToken());
            if(i == 0) A[i] = M;
            else A[i] = (M * (i + 1)) - sum;
            sum += A[i];
        }

        for(int a : A) {
            System.out.print(a + " ");
        }
    }
}
