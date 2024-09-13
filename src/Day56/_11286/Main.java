package Day56._11286;

import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (o1, o2) -> {
                    if (Math.abs(o1) == Math.abs(o2)) return o1 > o2 ? 1 : -1;
                    else return Math.abs(o1) - Math.abs(o2);
                }
        );

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if(X == 0) {
                if(!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                else sb.append(0).append("\n");
            } else queue.add(X);
        }

        System.out.println(sb);
    }
}