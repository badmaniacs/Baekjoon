package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_2606{
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[C+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<=C;i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i=0;i<T;i++){
            String[] data = br.readLine().split(" ");
            graph.get(Integer.parseInt(data[0])).add(Integer.parseInt(data[1]));
            graph.get(Integer.parseInt(data[1])).add(Integer.parseInt(data[0]));
        }
        DFS(1, graph, visited);
        bw.write(String.format("%d", count));
        bw.flush();
        bw.close();
    }
    static void DFS(int V, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        visited[V] = true;
        for(int i=0;i<graph.get(V).size();i++){
            int x = graph.get(V).get(i);
            if(!visited[x]){
                count++;
                DFS(x,graph,visited);
            }
        }
    }
}
