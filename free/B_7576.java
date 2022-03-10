package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] abc = br.readLine().split(" ");
        int M = Integer.parseInt(abc[0]);
        int N = Integer.parseInt(abc[1]);
        int[][] tomato = new int[M][N];
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                tomato[i][j] = Integer.parseInt(input[j]);
            }
        }
        for (int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                int a = BFS(tomato, i, j, M, N);
            }
        }
    }

    static int BFS(int[][] tomato, int x, int y, int M, int N) {
        if (tomato[x][y] == 0) {
            return 0;
        } else if (tomato[x][y] == -1) {
            return 0;
        } else {
            Queue<pair> que = new LinkedList<>();
            que.add(new pair(x, y));
            int[] dx = { 1, -1, 0, 0 };
            int[] dy = { 0, 0, 1, -1 };
            while (!que.isEmpty()) {
                pair temp = que.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = temp.x + dx[i];
                    int ny = temp.y + dy[i];
                    if (nx < 0 || nx >= M || ny < 0 || ny >= N)
                        continue;
                    if (tomato[nx][ny] == -1)
                        continue;
                    if (tomato[nx][ny] == 0) {
                        tomato[nx][ny] = tomato[temp.x][temp.y] + 1;
                        que.add(new pair(nx, ny));
                        System.out.println("looped");
                    }
                }
            }
            return 0;
        }
    }
}

class pair {
    int x;
    int y;

    pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}