package baekjoon.free;

import java.io.*;

public class B_1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());     
        for (int j = 0; j < T; j++) {
            String[] data = br.readLine().split(" ");
            int M = Integer.parseInt(data[0]);
            int N = Integer.parseInt(data[1]);
            int K = Integer.parseInt(data[2]);
            int[][] map = new int[N][M];
            int result = 0;
            for (int i = 0; i < K; i++) {
                String[] input = br.readLine().split(" ");
                map[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
            }
            for (int a=0;a<N;a++){
                for(int b=0;b<M;b++){
                    if(DFS(map, a, b, N, M)){
                        result++;
                    }
                }
            }
            bw.write(String.format("%d%n", result));           
        }
        bw.flush();
        bw.close();

    }

    static boolean DFS(int[][] map, int x, int y, int N, int M) {
        if (x < 0 || x > N - 1 || y < 0 || y > M - 1) {
            return false;
        } else {
            if (map[x][y] == 1) {
                map[x][y] = 0;
                DFS(map, x + 1, y, N, M);
                DFS(map, x - 1, y, N, M);
                DFS(map, x, y + 1, N, M);
                DFS(map, x, y - 1, N, M);
                return true;
            } else {
                return false;
            }
        }
    }
}
