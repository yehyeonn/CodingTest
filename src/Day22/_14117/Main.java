package Day22._14117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());    // 다솜이 표
        int answer = 0;

        if(N!=1) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 1; i <N; i++) {
                queue.add(Integer.parseInt(br.readLine()));

                while (queue.peek() >= dasom) {
                    int cur = queue.poll();
                    cur--;
                    dasom++;
                    answer++;

                    queue.add(cur);
                }
            }
        }
        System.out.println(answer);
        br.close();
    }
}
