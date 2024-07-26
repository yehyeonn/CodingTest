package Day15._2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                queue.add(Integer.parseInt(arr[j]));
            }
        }

        for (int j = 1; j < N; j++) {
            queue.poll();
        }

        System.out.println(queue.poll());
    }
}
