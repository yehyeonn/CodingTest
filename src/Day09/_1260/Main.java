package Day09._1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int V;
    static int cnt;

    static boolean[] visited;
    static int[][] rec;
    static Queue<Integer> que = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        rec = new int[N+1][N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            rec[x][y] = rec[y][x] = 1;
        }

        DFS(V);
        System.out.println();

        visited = new boolean[N + 1];
        BFS(V);

    }

    private static void DFS(int v) {
        visited[v] = true;
        System.out.printf(v + " ");

        if(cnt == N) {
            return;
        }
        cnt++;

        for (int i = 1; i <= N ; i++) {
            if(rec[v][i] == 1 && visited[i] == false) {
                DFS(i);
            }
        }
    }

    private static void BFS(int v) {
        que.offer(v);
        visited[v] = true;
        System.out.printf(v + " ");

        while(!que.isEmpty()) {
            v = que.poll();

            for (int i = 1; i <= N ; i++) {
                if(rec[v][i] == 1 && visited[i] == false) {
                    que.offer(i);
                    visited[i] = true;
                    System.out.printf(i + " ");
                }
            }
        }
    }


}
