package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        int[][] map = new int[N][M];
        for (int i=0;i<N;i++){
            String[] input = br.readLine().split("");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
        bw.write(String.format("%d", BFS(map, N, M)));
        bw.flush();
        bw.close();         
    }
    static int BFS(int[][] map, int N, int M){
        Queue<mPoint> que = new LinkedList<>();
        que.add(new mPoint(0,0));
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        while(!que.isEmpty()){
            int x = que.peek().x;
            int y = que.peek().y;
            que.poll();
            for (int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0||nx>=N||ny<0||ny>=M) continue;
                if(map[nx][ny]==0) continue;
                if(map[nx][ny]==1){
                    map[nx][ny] = map[x][y] + 1;
                    que.add(new mPoint(nx, ny));                
                }
            }                        
        }
        return map[N-1][M-1];
    }
}
class mPoint{
    int x;
    int y;
    mPoint (int x,int y){
        this.x = x;
        this.y = y;
    }
}
