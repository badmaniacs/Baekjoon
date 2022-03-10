package baekjoon.free;

import java.io.*;

public class B_2667 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        int result = 0;
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split("");
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(DFS(i, j, map, N)){
                    result++;
                }
            }
        }
        System.out.println(result);    
    }
    static boolean DFS(int x,int y, int[][] map, int N){
        if(x<0||x>N-1||y<0||y>N-1){
            return false;
        }
        else{
            if(map[x][y]==1){
                map[x][y] = 0;
                DFS(x+1, y, map, N);
                DFS(x-1, y, map, N);
                DFS(x, y+1, map, N);
                DFS(x, y-1, map, N);
                return true;
            }
            else{
                return false;
            }
        }
        
    }


}
