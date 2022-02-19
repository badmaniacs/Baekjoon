package baekjoon.free;

import java.io.*;
import java.util.*;

public class B_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> tree = new PriorityQueue<Integer>(new Compp());
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            int T = Integer.parseInt(br.readLine());
            if (T==0){  
                if(tree.size()==0){
                    bw.write(String.format("0%n"));
                } 
                else{
                    bw.write(String.format("%d%n",tree.poll()));
                }              
            }
            else{
                tree.add(T);
            }                        
        }
        bw.flush();
        bw.close();        
    }    
}
class Compp implements Comparator<Integer> {
    public int compare(Integer x,Integer y){
        return -(x.compareTo(y));
    }
}