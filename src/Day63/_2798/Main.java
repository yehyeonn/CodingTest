package Day63._2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int answer = search(card, N, M);
        System.out.println(answer);
    }

    private static int search(int[] card, int N, int M) {
        int answer = 0;

        for(int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(sum == M) return sum;
                    if(answer < sum && sum < M) answer = sum;
                }
            }
        }
        return answer;
    }
}