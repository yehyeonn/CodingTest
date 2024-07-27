package Day16._7569;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int H, N, M;
    static int[][][] box;
    static Queue<Tomato> queue = new LinkedList<>();

    static class Tomato {
        public int x;
        public int y;
        public int z;

        public Tomato(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());

                    if(box[i][j][k] == 1) {
                        queue.add(new Tomato(k, j, i)); // 익어있는 토마토 좌표
                    }
                }
            }
        }   // end for

        System.out.println(bfs());
    }

    private static int bfs() {
        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {1, -1, 0, 0, 0, 0};
        int[] dz = {0, 0, 0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            for (int i = 0; i < 6; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];
                int nz = tomato.z + dz[i];

                if(nx >= M || ny >= N || nz >= H || nx < 0 || ny < 0 || nz < 0) {
                    continue;
                }
                if(box[nz][ny][nx] == 0) {
                    queue.add(new Tomato(nx, ny, nz));

                    box[nz][ny][nx] = box[tomato.z][tomato.y][tomato.x] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(box[i][j][k] == 0) return -1;
                    max = Math.max(max, box[i][j][k]);
                }
            }
        }
        if(max == 1)    // 최대값이 1
            return 0;
        return max - 1;
    }
}