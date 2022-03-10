package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        ArrayList<TreeSet<Integer>> graph = new ArrayList<TreeSet<Integer>>();
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        int V = Integer.parseInt(data[2]);
        boolean[] visited = new boolean[N+1];
        boolean[] visitedd = new boolean[N+1];
        for (int i=0;i<N+1;i++){
            graph.add(new TreeSet<Integer>());
        }
        for (int i=0;i<M;i++){
            String[] data2 = br.readLine().split(" ");
            graph.get(Integer.parseInt(data2[0])).add(Integer.parseInt(data2[1]));
            graph.get(Integer.parseInt(data2[1])).add(Integer.parseInt(data2[0]));              
        }
        DFS(V, graph, visited);
        bw.newLine();
        BFS(V, graph, visitedd);
        bw.flush();
        
    }
    public static void DFS(int V, ArrayList<TreeSet<Integer>> graph, boolean[] visited) throws IOException {
        visited[V] = true;
        bw.append(V+" ");
        Iterator<Integer> it = graph.get(V).iterator();
        while(it.hasNext()){
            int x = it.next();
            if(!visited[x]){
                DFS(x,graph,visited);
            }
        }        
    }
    public static void BFS(int V, ArrayList<TreeSet<Integer>> graph, boolean[] visitedd) throws IOException {
        visitedd[V] = true;
        Queue<Integer> que = new LinkedList<>();
        que.offer(V);
        while(!que.isEmpty()){
            int x = que.poll();
            bw.append(x+" ");
            Iterator<Integer> it = graph.get(x).iterator();
            while(it.hasNext()){
                int y = it.next();
                if(!visitedd[y]){
                    que.offer(y);
                    visitedd[y] = true;
                }
            }          
        }
    }
}   
