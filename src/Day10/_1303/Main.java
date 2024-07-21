package Day10._1303;

import java.io.*;
import java.util.*;

public class Main {

    static int[] row = {-1, 1, 0, 0};
    static int[] column = {0, 0, -1, 1};
    static boolean[][] visited;
    static char[][] battle;

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 가로
        M = Integer.parseInt(st.nextToken());   // 세로

        battle = new char[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            battle[i] = br.readLine().toCharArray();
        }
        int W = 0;  // 아군
        int B = 0;  // 적군

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false) {
                    int cnt = bfs(i, j, battle[i][j]);
                    if (battle[i][j] == 'W') {
                        W += cnt * cnt;
                    } else B += cnt * cnt;
                }
            }
        }
        System.out.println(W + " " + B);
    }

    private static int bfs(int i, int j, char c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            cnt++;
            for (int k = 0; k < 4; k++) {
                int nx = now[0] + row[k];
                int ny = now[1] + column[k];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N && !visited[nx][ny] && battle[nx][ny] == c) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }

            }
        }
        return cnt;
    } // end bfs()
} // end main()
